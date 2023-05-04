import java.io.File;
import java.util.List;


import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.input.SAXBuilder;


public class ExemploGrafos {

    public static void main(String[] args) {
        
        // Rotina responsável por realizar a leitura do arquivo XML
        Document document = null;
        try {
            SAXBuilder builder = new SAXBuilder();
            document = builder.build(new File("src/config/grafos.xml"));
        } catch (Exception e) {
            e.printStackTrace();
            return;
        }
        
       // percorre os elementos do XML e recebe os dados referentes aos grafos 
       // e seus respectivos nós
        List<Element> grafos = document.getRootElement().getChildren("grafo");
        for (Element grafo : grafos) {
        	int idGrafo = Integer.parseInt(grafo.getAttributeValue("idGrafo"));
            String idNo = grafo.getAttributeValue("idNo");
            criarGrafo(idGrafo, idNo);
        }
    }
    
    public static void criarGrafo(int idGrafo, String idNo) {
        // cria um grafo com o número de nós especificado
    	System.out.println("Criando nó " + idNo + " no AS " + idGrafo);
    }
}
