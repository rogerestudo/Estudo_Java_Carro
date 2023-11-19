public class CarroCombate extends Carro {

        private int MAX_ARMAMENTO = 100;
        private int MIN_ARMAMENTO = 0;
        private int qtdeArmamento;

        public CarroCombate(String nome, int blindagem, int dano) {
            super(nome);
            setArmamento(true);
            setBlindagem(blindagem);
            this.qtdeArmamento = 100;
        }

        public void setQtdeArmamento(int armamento) {
            this.qtdeArmamento = armamento;
            if (this.qtdeArmamento > MAX_ARMAMENTO) {
                this.qtdeArmamento = MAX_ARMAMENTO;
            }
            if (this.qtdeArmamento < MIN_ARMAMENTO) {
                this.qtdeArmamento = 0;
            }
        }

        public int getQtdeArmamento() {
            return this.qtdeArmamento;
        }

        public void atirar() {
            if (qtdeArmamento > MIN_ARMAMENTO) {
                qtdeArmamento--;
            } else {
                System.out.println("Sem munição ");
            }
        }

        public void info() {
            super.info();
            System.out.printf("Quantidade de munição: %d%n", this.qtdeArmamento);
        }

    }

