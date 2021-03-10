package innerClass;

public class Computador {
    class Ram {
        public double getMemoria() {
            return memoria;
        }

        private double memoria = 1024;
    }

    class Processador {
        private double clock = 2.1;
        private double cache = 2;
        private int nucleos = 2;

        public double getClock() {
            return clock;
        }

        public double getCache() {
            return cache;
        }

        public int getNucleos() {
            return nucleos;
        }
    }

    class DiscoRigido {
        private double tamanho = 20;

        public double getTamanho() {
            return tamanho;
        }
    }
}
