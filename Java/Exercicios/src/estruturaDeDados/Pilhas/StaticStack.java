package exercicios.pilhas;

public class StaticStack {
    /******************************
     * CARACTERÍSTICAS DA PILHA
     * *******************************/

    /** REPRESENTA O TOPO DA PILHA */
    private int top;

    /** ESTRUTURA ESTÁTICA DE PILHA*/
    private int stack[];

    /** TAMANHO MÁXIMO DA PILHA*/
    private int size;

    public StaticStack(int size) {
        this.stack = new int[size];
        this.top = -1;
        this.size = size;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == size-1;
    }

    public int length() {
        return this.size;
    }

    public int peek() {
        if(isEmpty()) {
            System.out.println("Pilha vazia não é possível retornar o topo");
            return 0;
        }
        return this.stack[this.top];
    }

    public void push(int value) {
        if(isFull()) {
            System.out.println("Pilha cheia! não é possível empilhar novo ítem");
            return;
        }
        this.top++;
        this.stack[this.top] = value;
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("Pilha vazia, não é possível desempilhar");
            return -1;
        }
        int numero = this.stack[this.top];
        this.top--;
        return numero;
    }

    public void reverse () {
        int vetor[] = new int[size];
        for (int i = 0; i < size; i++) {
            vetor[i] = pop();
        }
        for (int i = 0; i < size; i++) {
            push(vetor[i]);
        }
    }
}