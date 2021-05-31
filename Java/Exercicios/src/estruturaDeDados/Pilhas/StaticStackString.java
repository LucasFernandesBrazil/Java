package exercicios.pilhas;

public class StaticStackString {
    /******************************
     * CARACTERÍSTICAS DA PILHA
     * *******************************/

    /** REPRESENTA O TOPO DA PILHA */
    private int top;

    /** ESTRUTURA ESTÁTICA DE PILHA*/
    private String stack[];

    /** TAMANHO MÁXIMO DA PILHA*/
    private int size;

    public StaticStackString(int size) {
        this.stack = new String[size];
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

    public String peek() {
        if(isEmpty()) {
            System.out.println("Pilha vazia não é possível retornar o topo");
            return "0";
        }
        return this.stack[this.top];
    }

    public void push(String string) {
        if(isFull()) {
            System.out.println("Pilha cheia! não é possível empilhar novo ítem");
            return;
        }
        this.top++;
        this.stack[this.top] = string;
    }

    public String pop() {
        if (isEmpty()) {
            return "0";
        }
        String string = this.stack[this.top];
        this.top--;
        return string;
    }

}