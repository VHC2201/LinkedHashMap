import java.util.LinkedHashMap;
import java.util.Map;

public class DemonstracaoLinkedHashMap {

    public static void main(String[] args) {
        System.out.println("=== SISTEMA DE E-COMMERCE: LINKEDHASHMAP NA PRÁTICA ===\n");

        demonstrarOrdemDeInsercao();
        demonstrarOrdemDeAcessoLRU();
    }

    private static void demonstrarOrdemDeInsercao() {
        System.out.println("1. CARRINHO DE COMPRAS (Mantém a ordem de chegada)");
        
        Map<String, Double> carrinho = new LinkedHashMap<>();
        
        carrinho.put("Notebook Dell", 4500.00);
        carrinho.put("Mouse Logitech", 150.00);
        carrinho.put("Teclado Mecânico", 350.00);
        carrinho.put("Mouse Logitech", 300.00); 

        for (Map.Entry<String, Double> item : carrinho.entrySet()) {
            System.out.println(" - " + item.getKey() + ": R$ " + item.getValue());
        }
        System.out.println("--------------------------------------------------\n");
    }

    private static void demonstrarOrdemDeAcessoLRU() {
        System.out.println("2. HISTÓRICO DE PRODUTOS RECENTES (Ordem de Acesso e Limite de Tamanho)");

        int limiteDoHistorico = 3;
        LinkedHashMap<Integer, String> historicoRecentes = new LinkedHashMap<>(16, 0.75f, true) {
            @Override
            protected boolean removeEldestEntry(Map.Entry<Integer, String> eldest) {
                return size() > limiteDoHistorico;
            }
        };

        historicoRecentes.put(101, "Monitor 24'");
        historicoRecentes.put(102, "Cadeira Gamer");
        historicoRecentes.put(103, "Headset");

        System.out.println("Histórico inicial: " + historicoRecentes.values());

        historicoRecentes.get(101); 
        System.out.println("Após o cliente rever o Monitor: " + historicoRecentes.values());

        historicoRecentes.put(104, "Webcam HD");
        System.out.println("Após ver a Webcam (Cadeira foi removida): " + historicoRecentes.values());
    }
}
