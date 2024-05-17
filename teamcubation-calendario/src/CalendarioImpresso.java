import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Scanner;

public class CalendarioImpresso {
    /**
     * <h1>1 - Calendário Anual</h1>
     * Escreva um programa que imprima um calendário anual para um determinado ano fornecido pelo usuário. O programa deve exibir os meses e os dias da semana de acordo com o ano e o dia da semana em que o ano começa.
     * <p>
     * <b>Note:</b> Desenvolvido na linguagem Java.
     *
     * @author  Marcos Ferreira Shirafuchi
     * @version 1.0
     * @since   17/05/2024
     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um ano para ser impresso o calendário:");
        int ano = scanner.nextInt();
        int dia=1;
        int mes = 5;
        int dias;
        if(anoEhBissexto(ano) == true){
            System.out.println();
            for (int i =1;i<=12;i++){
                mes =i;
                switch (mes){
                    case 1:
                        System.out.printf("    Janeiro | %d\n  ",ano);
                        break;
                    case 2:
                        System.out.printf("    Fevereiro | %d\n  ",ano);
                        break;
                    case 3:
                        System.out.printf("    Março | %d\n  ",ano);
                        break;
                    case 4:
                        System.out.printf("    Abril | %d\n  ",ano);
                        break;

                    case 5:
                        System.out.printf("    Maio | %d\n  ",ano);
                        break;

                    case 6:
                        System.out.printf("    Junho | %d\n  ",ano);
                        break;

                    case 7:
                        System.out.printf("    Julho | %d\n  ",ano);
                        break;

                    case 8:
                        System.out.printf("    Agosto | %d\n  ",ano);
                        break;
                    case 9:
                        System.out.printf("    Setembro | %d\n  ",ano);
                        break;
                    case 10:
                        System.out.printf("    Outubro | %d\n  ",ano);
                        break;

                    case 11:
                        System.out.printf("    Novembro | %d\n  ",ano);
                        break;

                    case 12:
                        System.out.printf("    Dezembro | %d\n  ",ano);
                        break;

                }
                if (mes<=9){
                    int diaSemana = getDiaSemana(LocalDate.parse(String.format("%s-%s-%s",ano,"0"+mes,"01")));
                    if (diaSemana == 7){
                        dia = diaSemana -6;
                    }else if (diaSemana == 6){
                        dia = diaSemana +1;
                    }else if (diaSemana == 5){
                        dia = diaSemana +1;
                    }else if (diaSemana == 4){
                        dia = diaSemana +1;
                    }else if (diaSemana == 3){
                        dia = diaSemana +1;
                    }else if (diaSemana == 2){
                        dia = diaSemana +1;
                    }else if (diaSemana == 1){
                        dia = diaSemana +1;
                    }

                    if(mes ==1 ||mes == 3 ||mes == 5 ||mes == 7 ||mes == 8 ||mes == 10 ||mes ==12){
                        dias =31;
                        System.out.println("D  S  T  Q  Q  S  S");
                        System.out.println("----------------------");
                        for(int j = 1; j < dia; j++){
                            System.out.print("   ");
                        }
                        for(int k = 1; k <= dias; k++){
                            if (k<=9){
                                System.out.print("|0" + k);
                            }else{
                                System.out.print("|" + k);
                            }

                            if(dia == 7){
                                dia = 1;
                                System.out.print("\n");
                            }else{
                                dia++;
                            }
                        }
                        System.out.println();
                        System.out.println();

                    } else if (mes == 4||mes == 6||mes ==9||mes ==11) {
                        dias =30;
                        System.out.println("D  S  T  Q  Q  S  S");
                        System.out.println("---------------------");
                        for(int j = 1; j < dia; j++){
                            System.out.print("   ");
                        }
                        for(int k = 1; k <= dias; k++){
                            if (k<=9){
                                System.out.print("|0" + k);
                            }else{
                                System.out.print("|" + k);
                            }

                            if(dia == 7){
                                dia = 1;
                                System.out.print("\n");
                            }else{
                                dia++;
                            }
                        }
                        System.out.println();
                        System.out.println();
                    }else{
                        dias =29;
                        System.out.println("D  S  T  Q  Q  S  S");
                        System.out.println("----------------------");
                        for(int j = 1; j < dia; j++){
                            System.out.print("   ");
                        }
                        for(int k = 1; k <= dias; k++){
                            if (k<=9){
                                System.out.print("|0" + k);
                            }else {
                                System.out.print("|" + k);
                            }
                            if(dia == 7){
                                dia = 1;
                                System.out.print("\n");
                            }else{
                                dia++;
                            }
                        }
                        System.out.println();
                        System.out.println();
                    }
                }else{
                    int diaSemana = getDiaSemana(LocalDate.parse(String.format("%s-%s-%s",ano,mes,"01")));
                    if (diaSemana == 7){
                        dia = diaSemana -6;
                    }else if (diaSemana == 6){
                        dia = diaSemana +1;
                    }else if (diaSemana == 5){
                        dia = diaSemana +1;
                    }else if (diaSemana == 4){
                        dia = diaSemana +1;
                    }else if (diaSemana == 3){
                        dia = diaSemana +1;
                    }else if (diaSemana == 2){
                        dia = diaSemana +1;
                    }else if (diaSemana == 1){
                        dia = diaSemana +1;
                    }

                    if(mes ==1 ||mes == 3 ||mes == 5 ||mes == 7 ||mes == 8 ||mes == 10 ||mes ==12){
                        dias =31;
                        System.out.println("D  S  T  Q  Q  S  S");
                        System.out.println("----------------------");
                        for(int j = 1; j < dia; j++){
                            System.out.print("   ");
                        }
                        for(int k = 1; k <= dias; k++){
                            if (k<=9){
                                System.out.print("|0" + k);
                            }else {
                                System.out.print("|" + k);
                            }
                            if(dia == 7){
                                dia = 1;
                                System.out.print("\n");
                            }else{
                                dia++;
                            }
                        }
                        System.out.println();
                        System.out.println();

                    } else if (mes == 4||mes == 6||mes ==9||mes ==11) {
                        dias =30;
                        System.out.println("D  S  T  Q  Q  S  S");
                        System.out.println("---------------------");
                        for(int j = 1; j < dia; j++){
                            System.out.print("   ");
                        }
                        for(int k = 1; k <= dias; k++){
                            if (k<=9){
                                System.out.print("|0" + k);
                            }else {
                                System.out.print("|" + k);
                            }
                            if(dia == 7){
                                dia = 1;
                                System.out.print("\n");
                            }else{
                                dia++;
                            }
                        }
                        System.out.println();
                        System.out.println();
                    }else{
                        dias =29;
                        System.out.println("D S T Q Q S S");
                        System.out.println("-------------");
                        for(int j = 1; j < dia; j++){
                            System.out.print("  ");
                        }
                        for(int k = 1; k <= dias; k++){
                            System.out.print("|" + k);
                            if(dia == 7){
                                dia = 1;
                                System.out.print("\n");
                            }else{
                                dia++;
                            }
                        }
                        System.out.println();
                        System.out.println();
                    }
                }

            }

        }else {
            System.out.println();
            for (int i = 1; i <= 12; i++) {
                mes = i;
                switch (mes) {
                    case 1:
                        System.out.printf("    Janeiro | %d\n  ", ano);
                        break;
                    case 2:
                        System.out.printf("    Fevereiro | %d\n  ", ano);
                        break;
                    case 3:
                        System.out.printf("    Março | %d\n  ", ano);
                        break;
                    case 4:
                        System.out.printf("    Abril | %d\n  ", ano);
                        break;

                    case 5:
                        System.out.printf("    Maio | %d\n  ", ano);
                        break;

                    case 6:
                        System.out.printf("    Junho | %d\n  ", ano);
                        break;

                    case 7:
                        System.out.printf("    Julho | %d\n  ", ano);
                        break;

                    case 8:
                        System.out.printf("    Agosto | %d\n  ", ano);
                        break;
                    case 9:
                        System.out.printf("    Setembro | %d\n  ", ano);
                        break;
                    case 10:
                        System.out.printf("    Outubro | %d\n  ", ano);
                        break;

                    case 11:
                        System.out.printf("    Novembro | %d\n  ", ano);
                        break;

                    case 12:
                        System.out.printf("    Dezembro | %d\n  ", ano);
                        break;

                }
                if (mes <= 9) {
                    int diaSemana = getDiaSemana(LocalDate.parse(String.format("%s-%s-%s", ano, "0" + mes, "01")));
                    if (diaSemana == 7) {
                        dia = diaSemana - 6;
                    } else if (diaSemana == 6) {
                        dia = diaSemana + 1;
                    } else if (diaSemana == 5) {
                        dia = diaSemana + 1;
                    } else if (diaSemana == 4) {
                        dia = diaSemana + 1;
                    } else if (diaSemana == 3) {
                        dia = diaSemana + 1;
                    } else if (diaSemana == 2) {
                        dia = diaSemana + 1;
                    } else if (diaSemana == 1) {
                        dia = diaSemana + 1;
                    }

                    if (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12) {
                        dias = 31;
                        System.out.println("D  S  T  Q  Q  S  S");
                        System.out.println("----------------------");
                        for (int j = 1; j < dia; j++) {
                            System.out.print("   ");
                        }
                        for (int k = 1; k <= dias; k++) {
                            if (k <= 9) {
                                System.out.print("|0" + k);
                            } else {
                                System.out.print("|" + k);
                            }

                            if (dia == 7) {
                                dia = 1;
                                System.out.print("\n");
                            } else {
                                dia++;
                            }
                        }
                        System.out.println();
                        System.out.println();

                    } else if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {
                        dias = 30;
                        System.out.println("D  S  T  Q  Q  S  S");
                        System.out.println("---------------------");
                        for (int j = 1; j < dia; j++) {
                            System.out.print("   ");
                        }
                        for (int k = 1; k <= dias; k++) {
                            if (k <= 9) {
                                System.out.print("|0" + k);
                            } else {
                                System.out.print("|" + k);
                            }

                            if (dia == 7) {
                                dia = 1;
                                System.out.print("\n");
                            } else {
                                dia++;
                            }
                        }
                        System.out.println();
                        System.out.println();
                    } else {
                        dias = 28;
                        System.out.println("D  S  T  Q  Q  S  S");
                        System.out.println("----------------------");
                        for (int j = 1; j < dia; j++) {
                            System.out.print("   ");
                        }
                        for (int k = 1; k <= dias; k++) {
                            if (k <= 9) {
                                System.out.print("|0" + k);
                            } else {
                                System.out.print("|" + k);
                            }
                            if (dia == 7) {
                                dia = 1;
                                System.out.print("\n");
                            } else {
                                dia++;
                            }
                        }
                        System.out.println();
                        System.out.println();
                    }
                } else {
                    int diaSemana = getDiaSemana(LocalDate.parse(String.format("%s-%s-%s", ano, mes, "01")));
                    if (diaSemana == 7) {
                        dia = diaSemana - 6;
                    } else if (diaSemana == 6) {
                        dia = diaSemana + 1;
                    } else if (diaSemana == 5) {
                        dia = diaSemana + 1;
                    } else if (diaSemana == 4) {
                        dia = diaSemana + 1;
                    } else if (diaSemana == 3) {
                        dia = diaSemana + 1;
                    } else if (diaSemana == 2) {
                        dia = diaSemana + 1;
                    } else if (diaSemana == 1) {
                        dia = diaSemana + 1;
                    }

                    if (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12) {
                        dias = 31;
                        System.out.println("D  S  T  Q  Q  S  S");
                        System.out.println("----------------------");
                        for (int j = 1; j < dia; j++) {
                            System.out.print("   ");
                        }
                        for (int k = 1; k <= dias; k++) {
                            if (k <= 9) {
                                System.out.print("|0" + k);
                            } else {
                                System.out.print("|" + k);
                            }
                            if (dia == 7) {
                                dia = 1;
                                System.out.print("\n");
                            } else {
                                dia++;
                            }
                        }
                        System.out.println();
                        System.out.println();

                    } else if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {
                        dias = 30;
                        System.out.println("D  S  T  Q  Q  S  S");
                        System.out.println("---------------------");
                        for (int j = 1; j < dia; j++) {
                            System.out.print("   ");
                        }
                        for (int k = 1; k <= dias; k++) {
                            if (k <= 9) {
                                System.out.print("|0" + k);
                            } else {
                                System.out.print("|" + k);
                            }
                            if (dia == 7) {
                                dia = 1;
                                System.out.print("\n");
                            } else {
                                dia++;
                            }
                        }
                        System.out.println();
                        System.out.println();
                    }

                    scanner.close();
                }
            }
        }
   }
    public static boolean anoEhBissexto(int ano){
        if(ano % 400 == 0){
            System.out.println();
            System.out.println(ano + " é ano bissexto.");
            return true;
            // se o ano for menor que 400
        } else if((ano % 4 == 0) && (ano % 100 != 0)){
            System.out.println();
            System.out.println(ano + " é ano bissexto.");
            return true;
        } else{
            System.out.println();
            System.out.println(ano + " não é ano bissexto");
            return false;
        }
    }

    public static int getDiaSemana(LocalDate date) {
        DayOfWeek day = date.getDayOfWeek();
        return day.getValue();
    }
}
