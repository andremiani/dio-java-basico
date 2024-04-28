import java.util.List;

import candidatura.*;

public class App {
    public static void main(String[] args) throws Exception {

        ProcessoSeletivo processoSeletivo = new ProcessoSeletivo();

        // processoSeletivo.analisarCandidato(1900.0);
        // processoSeletivo.analisarCandidato(2200.0);
        // processoSeletivo.analisarCandidato(2000.0);

        // 1. DEFINE A LISTA DE CANDIDATOS
        String[] candidatos = { "FELIPE", "MARCIA", "JULIA", "PAULO", "AUGUSTO", "MONICA", "FABRÍCIO", "MIRELA",
                "DANIELA", "JORGE" };

        System.out.println("----------------------------------");

        // 2. SELECIONA OS CANDIDATOS
        List<String> candidatosSelecionados = processoSeletivo.selecionarCandidatos(candidatos);

        System.out.println("----------------------------------");

        System.out.println("Os candidatos selecionados foram: " + candidatosSelecionados);

        System.out.println("----------------------------------");

        // 2. LIGA PARA OS CANDIDATOS
        candidatosSelecionados.forEach((candidato) -> processoSeletivo.ligarParaCandidato(candidato));

    }
}
