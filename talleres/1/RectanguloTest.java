
public class RectanguloTest {

    public static void main(String[] args) {
        // Test de los constructores
        System.out.println("Main en el cual se ensaya la función main\n");
        System.out.println("Test de los 4 tipos de constructores");
        VectorClass V1 = new VectorClass();
        VectorClass V2 = new VectorClass(5);
        VectorClass V3 = new VectorClass(6, (float)4.5);
        float v_internal[] = {3.4f,3.3f,2.2f};
        VectorClass V4 = new VectorClass(v_internal);
        System.out.println();
        System.out.println("Test del metodo printVector para cada uno de los vectores");
        // Test del metodo printVector
        V1.printVector();
        V2.printVector();
        V3.printVector();
        V4.printVector();
        
        System.out.println();
        System.out.println("Test del metodo getElement");
        // Test del metodo getElement
        System.out.println("V4[2] = " + V4.getElement(2));
        
        System.out.println();
        System.out.println("Test del metodo setElement");
        // Test del metodo setElement
        V1.setElement(0, -1.9f);
        
        System.out.println();
        System.out.println("Test del metodo getSize");
        // Test del metodo getSize
        int tam = V1.getSize();
        
        System.out.println();
        System.out.println("Test del metodo setElement");
        // Test del metodo setElement
        V1.setElement(tam - 1, V4.getElement(2) + 1);
        V1.printVector();        
        
        System.out.println();
        System.out.println("Test del metodo getElements");
        // Test del metodo getElements
        float elements_return[] = V1.getElements();
        for(float e: elements_return) {
            System.out.print(e + " ");
        }
        
        System.out.println();
        System.out.println("Test del metodo getElement");       
        System.out.println("V4[2] = " + V4.getElement(2));
        
        System.out.println();
        System.out.println("Test del metodo contains");      
        // Test del metodo 
        System.out.println("is 0.0 in V4? " + V4.contains(0f));
        System.out.println("is 2.2 in V4? " + V4.contains(2.2f));
        
        System.out.println();
        System.out.println("Test de los metodos getMaximo y getMinimo");      
        // Test de los metodos getMaximo y getMinimo
        float max = V4.getMaximo();
        float min = V4.getMinimo();
        System.out.println("max(V4) = " + max + "; min(V4) = " + min);
        
        System.out.println();
        System.out.println("Test de los metodos addElements y getAverage");      
        // Test de los metodos y getAverage
        float suma = V4.addElements();
        float prom = V4.getAverage();
        System.out.println("sum(V4) = " + suma + "; avg(V4) = " + prom);      
    } 
}

