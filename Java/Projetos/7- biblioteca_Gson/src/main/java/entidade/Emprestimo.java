
package entidade;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;

    public class Emprestimo {
        private LocalDate inicioE ;
        private LocalDate entregaE;
        private int diasAt;
        private double multa;
        Livro livro;
        Cliente cliente;
        public Emprestimo(Livro livro ,Cliente cliente,LocalDate inicioE) {
            this.livro = livro;
            this.cliente = cliente;
            this.inicioE=inicioE;

        }

        public Emprestimo(LocalDate inicioE, LocalDate entregaE, int diasAt, double multa, Livro livro, Cliente cliente) {

            this.inicioE = inicioE;
            this.entregaE = entregaE;
            this.diasAt = diasAt;
            this.multa = multa;
            this.livro = livro;
            this.cliente = cliente;
        }
        public Emprestimo(Livro livro,Cliente cliente) {
            this.livro=livro;
            this.cliente=cliente;
        }



        public LocalDate getInicioE() {
            return inicioE;
        }
        public void setInicioE(LocalDate inicioE) {
            this.inicioE = inicioE;
        }
        public LocalDate getEntregaE() {
            return entregaE;
        }
        public void setEntregaE(LocalDate entregaE) {
            this.entregaE = entregaE;
        }
        public int getDiasAt() {
            return diasAt;
        }
        public void setDiasAt(int diasAt) {
            this.diasAt = diasAt;
        }
        public double getMulta() {
            return multa;
        }
        public void setMulta(double multa) {
            this.multa = multa;
        }
        public Livro getLivro() {
            return livro;
        }
        public void setLivro(Livro livro) {
            this.livro = livro;
        }
        public Cliente getCliente() {
            return cliente;
        }
        public void setCliente(Cliente cliente) {
            this.cliente = cliente;
        }
        @Override
        public String toString() {
            return "[Emprestimo:"+ "Cliente:"+cliente.getNome()+ " Id:"+cliente.getId()+
                    " Livro:"+livro.getTitle()+ " Idlivro:"+livro.getId() + " Data do emprestimo:"+ inicioE+"]";

        }

    }

