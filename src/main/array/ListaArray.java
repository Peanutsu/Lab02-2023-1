package array;

import list.EstruturaElementar;

public class ListaArray implements EstruturaElementar{

    private int[] array;
    private int indice_fim;

    public ListaArray() {

    }

    @Override
    public boolean buscaElemento(int valor) {
        if (this.array != null) {
            for (int i = 0; i <= this.indice_fim; i++) {
                if (this.array[i] == valor) {
                    return true; 
                }
            }
        }
        return false; 
    }
    @Override
    public int buscaIndice(int valor) {
       return array[valor];
    }

    @Override
    public int minimo() {
        int minimo = Integer.MAX_VALUE;
        for( int i = 0; i <array.length; i++){
            if(array[i] < minimo){
                minimo = array[i];
            }
        }
        return minimo;
    }
       

    @Override
    public int maximo() {
       if(array.length == 0){
         return Integer.MIN_VALUE;
       }
         int maximo = array[0];
       for (int i = 0; i < array.length; i++){
         if(array[i] > maximo){
            maximo = array[i];
         }
       }
       return maximo;
    }

    @Override
    public int predecessor(int valor) {
       if(array.length == 0){
        return Integer.MIN_VALUE;
       }

       int predecessor = Integer.MIN_VALUE;
       for(int i = 0; i < array.length; i++){
         if(array[i] == valor){
            return predecessor;
         }
         predecessor = array[i];
       }
       return predecessor;
    }

    @Override
    public int sucessor(int valor) {
        for(int i = 0; i < array.length -1 ; i ++){
            if (array[i] == valor){
                return array[i + 1];
            }
        }
        return valor;
    }

    @Override
    public void insereElemento(int valor) {
       if (this.array != null) {
            int[] objeto = new int[this.array.length + 1];
            for (int i = 0; i < this.array.length; i++) {
                objeto[i] = this.array[i];
            }
            objeto[this.array.length] = valor;
            this.array = objeto;
            this.indice_fim = this.array.length - 1;
        } else {
            this.array = new int[1];
            this.array[0] = valor;
            this.indice_fim = 0;
        }
    }

    @Override
    public void insereElementoPosicao(int valor, int buscaIndice) {
        if(this.array != null && buscaIndice >= 0 && buscaIndice <= this.indice_fim+1){
            int tamanho = this.array.length + 1;
            int[] array2 = new int[tamanho];


            for(int i = 0; i < buscaIndice; i++){
                array2[i] = this.array[i];
            }
            array2[buscaIndice] = valor;
        
            for(int i = buscaIndice + 1; i < tamanho; i++){
                array2[i] = this.array[i -1];
                
            }
            this.array = array2;
            this.indice_fim = tamanho -1;
            
        }
        
    }
        

    

    @Override
    public void insereInicio(int valor) {
        if(this.array != null){
            int[] objeto = new int[this.array.length+1];
            for (int i = 0; i < this.array.length ; i++){
                objeto[i +1] = this.array[i];
            }
            objeto[0] = valor;
            this.array = objeto;
            this.indice_fim = this.array.length-1;
        
        }
        else{
            this.array = new int[1];
            this.array[0] = valor;
            this.indice_fim = 0;

        }
        }
    

    @Override
    public void insereFim(int valor) {
        if (this.array != null) {
            int[] objeto = new int[this.array.length + 1];
            for (int i = 0; i < this.array.length; i++) {
                objeto[i] = this.array[i];
            }
            objeto[this.array.length] = valor;
            this.array = objeto;
            this.indice_fim = this.array.length - 1;
        } else {
            this.array = new int[1];
            this.array[0] = valor;
            this.indice_fim = 0;
        }
    }

    @Override
    public void remove(int valor) {
        if (this.array != null && valor >=0 && valor <= this.indice_fim){
        int tamanho3 = this.indice_fim;
        int[] array3 = new int[tamanho3];

        for (int i = 0, j = 0; i < this.indice_fim; i++){
            if(i != valor){
                array3[j++] = this.array[i];
            }
            
        }
        this.array = array3;
        this.indice_fim = tamanho3 - 1;

      }  

        
    }

    @Override
   public void removeIndice(int indice) {
    if (this.array != null && indice >= 0 && indice <= this.indice_fim) {
        int tamanho3 = this.indice_fim;
        int[] array3 = new int[tamanho3];

        for (int i = 0, j = 0; i <= this.indice_fim; i++) {
            if (i != indice) {
                array3[j++] = this.array[i];
            }
        }
        this.array = array3;
        this.indice_fim = tamanho3 - 1;
    }
}
       

    @Override
    public void removeInicio() {
        if (this.array != null && this.indice_fim >= 0) {

            int[] arrayNovo = new int[this.array.length - 1];
            for (int i = 0; i < this.indice_fim; i++) {
                arrayNovo[i] = this.array[i + 1];
            }
            this.array = arrayNovo;
            this.indice_fim = this.array.length - 1;
        }
    }

    @Override
    public void removeFim() {
        if (this.array != null && this.indice_fim >= 0) { 
            int tamanho2 = this.array.length - 1;
            int[] arrayNovo2 = new int[tamanho2];

            for (int i = 0; i < tamanho2; i++){
                arrayNovo2[i] = this.array[i];
            }
            this.array = arrayNovo2;
            this.indice_fim = tamanho2 -1;
        }
    }}
          
    