package exercicios.pilhas;

import java.util.Scanner;

public class Exercicio15 {
    public static void main(String[] args) {
        String matrizGrafica[][] = new String[7][3];
        StaticStack pino1 = new StaticStack(7);
        StaticStack pino2 = new StaticStack(7);
        StaticStack pino3 = new StaticStack(7);
        iniciarJogo(pino1, pino2, pino3);
        printMatriz(representacaoGrafica(pino1, pino2, pino3, matrizGrafica));
    }

    public static void iniciarJogo(StaticStack pinoComeco, StaticStack pino2, StaticStack pino3) {
        for (int i = 0; i < pinoComeco.length(); i++) {
            pinoComeco.push(pinoComeco.length() - i);
        }
        while (!pino3.isEmpty()) {
            pino3.pop();
        }
        while (!pino2.isEmpty()) {
            pino2.pop();
        }
    }

    public static void movimentoDePino(StaticStack pinoOrigem, StaticStack pinoDestino) {
        int pinoMovimentado = pinoOrigem.pop();
        int topDestino;
        if (pinoDestino.isEmpty()) {
            pinoDestino.push(pinoMovimentado);
        } else {
            topDestino = pinoDestino.pop();
            if (pinoMovimentado < topDestino) {
                pinoDestino.push(topDestino);
                pinoDestino.push(pinoMovimentado);
            } else if (pinoMovimentado > topDestino) {
                System.out.println("Movimento inválido! Tente novamente.");
                pinoOrigem.push(pinoMovimentado);
            }
        }
    }

    public static void jogoExecucao(StaticStack pino1, StaticStack pino2, StaticStack pino3) {
        Scanner scan = new Scanner(System.in);
        int origem, destino;
        System.out.print("Informe o numero do pino de origem" +
                "\n[1] Pino 1" +
                "\n[2] Pino 2" +
                "\n[3] Pino 3" +
                "\n[4] Reiniciar" +
                "\n-->");
        origem = scan.nextInt();
        if (origem == 4) {
            iniciarJogo(pino1, pino2, pino3);
        }
        System.out.print("Informe o numero do pino de destino" +
                "\n[1]            [2]            [3]" +
                "\n-->");
        destino = scan.nextInt();
        if (origem == destino) {
            System.out.println("Movimento inválido");
        } else if (origem == 1 && destino == 2) {
            movimentoDePino(pino1, pino2);
        } else if (origem == 1 && destino == 3) {
            movimentoDePino(pino1, pino3);
        } else if (origem == 2 && destino == 1) {
            movimentoDePino(pino2, pino1);
        } else if (origem == 2 && destino == 3) {
            movimentoDePino(pino2, pino3);
        } else if (origem == 3 && destino == 1) {
            movimentoDePino(pino3, pino1);
        } else if (origem == 3 && destino == 2) {
            movimentoDePino(pino3, pino2);
        }
    }

    public static boolean vitoria4Discos(StaticStack destino) {
        if (destino.isEmpty()) {
            return false;
        }
        if (destino.pop() == 1) {
            if (destino.isEmpty()) {
                destino.push(1);
                return false;
            } else if (destino.pop() == 2) {
                if (destino.isEmpty()) {
                    destino.push(2);
                    destino.push(1);
                    return false;
                } else if (destino.pop() == 3) {
                    if (destino.isEmpty()) {
                        destino.push(3);
                        destino.push(2);
                        destino.push(1);
                        return false;
                    } else if (destino.pop() == 4) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static boolean vitoria7Discos(StaticStack destino) {
        if (destino.isEmpty()) {
            return false;
        }
        if (destino.pop() == 1) {
            if (destino.isEmpty()) {
                destino.push(1);
                return false;
            } else if (destino.pop() == 2) {
                if (destino.isEmpty()) {
                    destino.push(2);
                    destino.push(1);
                    return false;
                } else if (destino.pop() == 3) {
                    if (destino.isEmpty()) {
                        destino.push(3);
                        destino.push(2);
                        destino.push(1);
                        return false;
                    } else if (destino.pop() == 4) {
                        if (destino.isEmpty()) {
                            destino.push(4);
                            destino.push(3);
                            destino.push(2);
                            destino.push(1);
                            return false;
                        } else if (destino.pop() == 5) {
                            if (destino.isEmpty()) {
                                destino.push(5);
                                destino.push(4);
                                destino.push(3);
                                destino.push(2);
                                destino.push(1);
                                return false;
                            } else if (destino.pop() == 6) {
                                if (destino.isEmpty()) {
                                    destino.push(6);
                                    destino.push(5);
                                    destino.push(4);
                                    destino.push(3);
                                    destino.push(2);
                                    destino.push(1);
                                    return false;
                                } else if (destino.pop() == 7) {
                                    return true;
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public static String[][] representacaoGrafica(StaticStack pino1, StaticStack pino2, StaticStack pino3, String[][] matrizGrafica) {
        StaticStack aux = new StaticStack(pino1.length());
        int disco;
        int cont1 = 0;
        int cont2 = 0;
        int cont3 = 0;

        //Coleta de dados pino 1
        while (!pino1.isEmpty()) {
            aux.push(pino1.pop());
        }
        while (!aux.isEmpty()) {
            disco = aux.pop();
            if (disco == 7) {
                matrizGrafica[cont1][1] = "0000000   ";
                cont1++;
            }
            if (disco == 6) {
                matrizGrafica[cont1][1] = "000000   ";
                cont1++;
            }
            if (disco == 5) {
                matrizGrafica[cont1][1] = "00000   ";
                cont1++;
            }
            if (disco == 4) {
                matrizGrafica[cont1][1] = "0000   ";
                cont1++;
            }
            if (disco == 3) {
                matrizGrafica[cont1][1] = "000   ";
                cont1++;
            }
            if (disco == 2) {
                matrizGrafica[cont1][1] = "00   ";
                cont1++;
            }
            if (disco == 1) {
                matrizGrafica[cont1][1] = "0   ";
                cont1++;
            }
            pino1.push(disco);
        }

        //Coleta de dados pino 2
        while (!pino2.isEmpty()) {
            aux.push(pino2.pop());
        }
        while (!aux.isEmpty()) {
            disco = aux.pop();
            if (disco == 7) {
                matrizGrafica[cont1][1] = "0000000   ";
                cont1++;
            }
            if (disco == 6) {
                matrizGrafica[cont1][1] = " 000000    ";
                cont1++;
            }
            if (disco == 5) {
                matrizGrafica[cont1][1] = "  00000     ";
                cont1++;
            }
            if (disco == 4) {
                matrizGrafica[cont1][1] = "   0000      ";
                cont1++;
            }
            if (disco == 3) {
                matrizGrafica[cont1][1] = "    000       ";
                cont1++;
            }
            if (disco == 2) {
                matrizGrafica[cont1][1] = "     00        ";
                cont1++;
            }
            if (disco == 1) {
                matrizGrafica[cont1][1] = "      0         ";
                cont1++;
            }
            pino2.push(disco);
        }

        //Coleta de dados pino 3
        while (!pino3.isEmpty()) {
            aux.push(pino3.pop());
        }
        while (!aux.isEmpty()) {
            disco = aux.pop();
            if (disco == 7) {
                matrizGrafica[cont1][1] = "0000000   ";
                cont1++;
            }
            if (disco == 6) {
                matrizGrafica[cont1][1] = " 000000    ";
                cont1++;
            }
            if (disco == 5) {
                matrizGrafica[cont1][1] = "  00000     ";
                cont1++;
            }
            if (disco == 4) {
                matrizGrafica[cont1][1] = "   0000      ";
                cont1++;
            }
            if (disco == 3) {
                matrizGrafica[cont1][1] = "    000       ";
                cont1++;
            }
            if (disco == 2) {
                matrizGrafica[cont1][1] = "     00        ";
                cont1++;
            }
            if (disco == 1) {
                matrizGrafica[cont1][1] = "      0         ";
                cont1++;
            }
            pino3.push(disco);
        }
        if (pino1.isEmpty()) {
            for (int i = 0; i < pino3.length(); i++) {
                matrizGrafica[i][0] = "       ";
            }
        }
        if (pino2.isEmpty()) {
            for (int i = 0; i < pino3.length(); i++) {
                matrizGrafica[i][1] = "       ";
            }
        }
        if (pino3.isEmpty()) {
            for (int i = 0; i < pino3.length(); i++) {
                matrizGrafica[i][2] = "       ";
            }
        }
        return matrizGrafica;
    }

    public static void printMatriz(String x[][]) {

        for (int i = 0; i < x.length; i++) {
                System.out.println(x[i][0] + x[i][1] + x[i][2]);
            }
    }
}
