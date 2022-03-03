package arquivo;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import entidade.Livro;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class Livroarquivo {
    private Gson gson = new GsonBuilder().setPrettyPrinting().create();
    public String caminho = "src\\Arquivos\\Livros";

    public void salvar(List<Livro> livros) {
        try (FileWriter fileWriter = new FileWriter(caminho);
             BufferedWriter bufferedWriter = new BufferedWriter(fileWriter)) {
             bufferedWriter.write(gson.toJson(livros));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}


