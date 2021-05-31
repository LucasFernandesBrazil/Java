package exercicios.pilhas;

public class StaticStackChar {
    /******************************
     * CARACTERÍSTICAS DA PILHA
     * *******************************/

    /** REPRESENTA O TOPO DA PILHA */
    private int top;

    /** ESTRUTURA ESTÁTICA DE PILHA*/
    private char stack[];

    /** TAMANHO MÁXIMO DA PILHA*/
    private int size;

    public StaticStackChar(int size) {
        this.stack = new char[size];
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

    public char peek() {
        if(isEmpty()) {
            System.out.println("Pilha vazia não é possível retornar o topo");
            return 0;
        }
        return this.stack[this.top];
    }

    public void push(char value) {
        if(isFull()) {
            System.out.println("Pilha cheia! não é possível empilhar novo ítem");
            return;
        }
        this.top++;
        this.stack[this.top] = value;
    }

    public char pop() {
        if(isEmpty()) {
            System.out.println("Pilha vazia, não é possível desempilhar");
            char response = 0;
            return response;
        }
        char letra = this.stack[this.top];
        this.top--;
        return letra;
    }
}