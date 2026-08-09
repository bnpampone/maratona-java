package academy.devdojo.maratonajava.javacore.ZZDoptional.exercises;

import java.util.List;
import java.util.Optional;

public class exercises05 {
    public static void main(String[] args) {
        List<Usuario> usuarios = List.of(new Usuario(1L, "Midoriya"), new Usuario(2L, "Bakugo"), new Usuario(5L, "All Might"));
        mostrarUsuario(buscarUsuario(usuarios, 5L));

    }
    public static Optional<Usuario> buscarUsuario(List<Usuario> usuarioList, Long id){
        for (Usuario usuario : usuarioList) {
            if(usuario.getId().equals(id)){
                return Optional.of(usuario);
            }
        }
        return Optional.empty();

    }

    public static void mostrarUsuario(Optional<Usuario> usuario){
        Usuario usuarioEncontrado = usuario.orElseThrow(() -> new RuntimeException("Usuário não encontrado"));
        System.out.println("Usário encontrado: " + usuarioEncontrado);
    }
}
