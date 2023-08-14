package br.com.alura.screenmatch.modelos;

public class ErroDeConversaoDeAnoExceptiopn extends RuntimeException {
    private String mensagem;
    public ErroDeConversaoDeAnoExceptiopn(String s) {
        this.mensagem = s;
    }

    @Override
    public String getMessage() {
        return this.mensagem;
    }
}
