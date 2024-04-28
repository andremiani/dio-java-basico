package candidatura;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {

    List<String> candidatosSelecionados = new ArrayList<String>();
    List<String> candidatosConfirmados = new ArrayList<String>();

    int totalCandidatosSelecionados = 0;
    int limiteCandidatos = 5;
    int idxCandidato = 0;
    double salarioBase = 2000.0;

    public void analisarCandidato(double salarioPretendido) {
        double salarioBase = 2000.0;
        if (salarioBase > salarioPretendido) {
            System.out.println("LIGAR PARA O CANDIDATO");
        } else if (salarioBase == salarioPretendido) {
            System.out.println("LIGAR PARA O CANDIDATO COM CONTRA PROPOSTA");
        } else {
            System.out.println("AGUARDANDO RESULTADO DOS DEMAIS CANDIDATOS");

        }
    }

    public List<String> selecionarCandidatos(String[] candidatos) {

        // 1. seleciona os candidatos
        while (totalCandidatosSelecionados < limiteCandidatos && idxCandidato < candidatos.length) {
            String candidatoAtual = candidatos[idxCandidato];
            double salarioPretendidoCandidatoAtual = salarioPretendidoCandidato();
            verificarCandidato(candidatoAtual, salarioPretendidoCandidatoAtual);
            idxCandidato++;
        }

        return candidatosSelecionados;

    }

    public void verificarCandidato(String candidatoAtual, double salarioPretendidoCandidatoAtual) {
        System.out.println("O candidato " + candidatoAtual + " solicitou uma remuneração de "
                + salarioPretendidoCandidatoAtual);

        if (salarioBase > salarioPretendidoCandidatoAtual) {
            System.out.println("O candidato " + candidatoAtual + " foi selecionado para a vaga");
            candidatosSelecionados.add(candidatoAtual);
            totalCandidatosSelecionados++;
        } else {
            System.out.println("O candidato " + candidatoAtual + " não foi selecionado para a vaga");
        }

    }

    public void ligarParaCandidato(String candidato) {
        int limiteTentativas = 3;
        int tentativasRealizadas = 1;
        boolean continuarTentando = true;
        boolean ligacaoAtentida = false;

        do {

            ligacaoAtentida = atenderLigacao();

            if (ligacaoAtentida)
                continuarTentando = false;

            if (continuarTentando) {
                candidatosConfirmados.add(candidato);
                tentativasRealizadas++;
            }

        } while (continuarTentando && tentativasRealizadas < limiteTentativas);

        if (ligacaoAtentida) {
            System.out.println("CONSEGUIMOS CONTATO COM " + candidato + " NA " + tentativasRealizadas + " TENTATIVA");
        } else {
            if (tentativasRealizadas == 1) {
                System.out
                        .println("NÃO CONSEGUIMOS CONTATO COM " + candidato + " EM " + tentativasRealizadas
                                + " TENTATIVA");
            } else {
                System.out
                        .println("NÃO CONSEGUIMOS CONTATO COM " + candidato + " EM " + tentativasRealizadas
                                + " TENTATIVAS");

            }

        }
    }

    public boolean atenderLigacao() {
        return new Random().nextInt(3) == 1;
    }

    static double salarioPretendidoCandidato() {
        return ThreadLocalRandom.current().nextDouble(1800, 2000);
    }

}
