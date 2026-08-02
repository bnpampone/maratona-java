package academy.devdojo.maratonajava.javacore.Kenumeracoes.dominio;

public enum TipoPagamento{
        DEBITO{
            @Override
            public double calcDesconto(double valor) {
                return valor * 0.1;
            }
        }, CREDITO{
        @Override
        public double calcDesconto(double valor) {
            return valor * 0.05;
        }
    };

    public abstract double calcDesconto(double valor);
    }