class VectorClass {
   /* Miembros */
   private int size;
   private float elements[];

   /**
      Constructor
      @param None (crea un vector de 10 elementos).
   */
   public VectorClass() {
     // Code ...

   }
   
   /**
      Constructor
      @param tam El tamaño del Vector.
   */
   public VectorClass(int tam) {
     // Code ...     
     
   }
   
   /**
      Constructor
      @param tam El tamaño del Vector.
      @param value Los valores con los que sera llenado cada uno de los elementos del vector.
   */
   public VectorClass(int tam, float value) {     
     // Code
     
   }

   /**
      Constructor
      @param vectorIn vector empleado para inicializar el objeto.
   */
   public VectorClass(float vectorIn[]) {
     // Code ...
     
   }
   
   /**
      Obtiene el tamaño del vector (dado en el miembro size)
      @return el tamaño del vector
   */
   public int getSize(){
      // Code ...
       
   }
   
    /**
      Obtiene los elementos del vector (dado en el miembro elements)
      @return los elementos del vector
   */  
   public float [] getElements() {
       // Code ...
       
   }

   /**
      Imprime en pantalla el contenido del vector
      @param None
      @return None
   */
   public void printVector() {
      // Code ...
       
   }

   /**
      Asigna un elemento al array en una posicion dada
      @param index la posicion 
      @param element elemento a asignar en la posicion index.
      @return None
   */
   public void setElement(int index,float element){ 
      // Code ... 
       
   }

   /**
      Obtiene un elemento de una posición dada
      @param index la posicion 
      @return el elemento en la posicion en cuestion
   */
   public float getElement(int index) { 
      // Code ...
       
   }

   /**
      Retorna verdadero si un elemento se encuentra dentro del vector
      @param e es el elemento a chequear
      @return True si el elemento e se encuentra en el vector o False en caso contrario
   */
   public boolean contains(float e) {
      // Code ...
      
   }

   /**
      Suma los elementos del vector
      @param None
      @return la suma de todos los elementos del vector
   */
   public float addElements() {
      // Code ...
             
   }

   /**
      Obtiene el promedio de los elementos del vector
      @param None
      @return el promedio de los elementos del vector ingresado
   */
   public float getAverage() {
     // Code ...
     
   }

   /**
      Obtiene  el valor minimo del vector
      @param None
      @return elemento minimo presente en el vector
   */
   public float getMinimo() {
     // Code ...
     
   }

   /**
      Obtiene  el valor maximo del vector
      @param None
      @return elemento maximo del vector 
   */

   public float getMaximo() {
     // Code ...
     
   }
}
