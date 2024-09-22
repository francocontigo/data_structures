public class bubblesort {

    public static void main(String[] args) {
        int[] vetor = {7,25,1,2,3,4,9,12,6,14};
        bubbleSort(vetor);
        int cont;
        for (cont=0;cont<10;cont++){
            System.out.println(vetor[cont]);
        }
    }

    public static void bubbleSort(int[] vet){
        int cont, par;
        for (cont=0;cont<9;cont++){
            for (par=cont+1;par<10;par++){
                if (vet[par] < vet[cont]){
                        int aux;
                        aux = vet[cont];
                        vet[cont] = vet[par];
                        vet[par] = aux;
                }
            }
        }
    }

}
