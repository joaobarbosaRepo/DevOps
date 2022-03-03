package arquivo;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import entidade.Cliente;


import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class Clientearquivo {
    private Gson gson = new GsonBuilder().setPrettyPrinting().create();
    public String caminho = "src\\Arquivos\\Clientes";

    public void salvar(List<Cliente> clientes) {
        try (FileWriter fileWriter = new FileWriter(caminho);
             BufferedWriter bufferedWriter = new BufferedWriter(fileWriter)) {
            bufferedWriter.write(gson.toJson(clientes));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
