package arquivo;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import entidade.Cliente;
import entidade.Emprestimo;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class Emprestimoarquivo {
    private Gson gson = new GsonBuilder().setPrettyPrinting().create();
    public String caminho = "src\\Arquivos\\emprestimos";

    public void salvar(List<Emprestimo> emprestimos) {
        try (FileWriter fileWriter = new FileWriter(caminho);
             BufferedWriter bufferedWriter = new BufferedWriter(fileWriter)) {
            bufferedWriter.write(gson.toJson(emprestimos));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}