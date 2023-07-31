import java.sql.SQLOutput;
import java.util.Scanner;
import java.util.ArrayList;

public class Main{
    private static int menuSelect;
    static ArrayList<Reminder> reminders = new ArrayList();
    static Scanner local = new Scanner(System.in);

    public static void main(String[] args){
        do{
            System.out.println("Selecionar Opção");
            System.out.println("1: Criar Lembrete");
            System.out.println("2: Criar Tarefa");
            System.out.println("3: Criar Evento");
            System.out.println("4: Ver Datas Marcadas");
            System.out.println("5: Atualizar Datas Marcadas");
            System.out.println("6: Encerrar Programa");

            Scanner selector = new Scanner(System.in);
            menuSelect = selector.nextInt();

        switch (menuSelect) {
            case 1:
                Reminder reminder = new Reminder();
                System.out.println("Adicionar Título:");
                reminder.setTitle(local.nextLine());
                System.out.println("Data:");
                reminder.setDate(local.nextLine());
                System.out.println("Horário:");
                reminder.setTime(local.nextLine());
                reminders.add(reminder);
                break;
            case 2:
                Task task = new Task();
                System.out.println("Adicionar Título:");
                task.setTitle(local.nextLine());
                System.out.println("Data:");
                task.setDate(local.nextLine());
                System.out.println("Horário:");
                task.setTime(local.nextLine());
                System.out.println("A tarefa se repete? (true or false)");
                task.setRepeats(Boolean.parseBoolean(local.nextLine()));
                System.out.println("Adicione uma descrição:");
                task.setDescription(local.nextLine());
                reminders.add(task);
                break;
            case 3:
                Event event = new Event();
                System.out.println("Adicionar Título:");
                event.setTitle(local.nextLine());
                System.out.println("Qual a data de inicio?");
                event.setDate(local.nextLine());
                System.out.println("Qual o horário de inicio?");
                event.setTime(local.nextLine());
                System.out.println("Qual a data de Término?");
                event.setEndDate(local.nextLine());
                System.out.println("Qual o horario de termino?");
                event.setEndTime(local.nextLine());
                System.out.println("Qual a localização?");
                event.setLocation(local.nextLine());
                System.out.println("A tarefa se repete? (true or false)");
                event.setRepeats(Boolean.parseBoolean(local.nextLine()));
                System.out.println("Adicione uma descrição:");
                event.setDescription(local.nextLine());
                reminders.add(event);
                break;
            case 4:
                for (Reminder listReminders : reminders) {
                    if(listReminders.getClass().getName() == "Task"){
                        Task listTask = (Task) listReminders;
                    }
                    if(listReminders.getClass().getName() == "Event"){
                        Event listEvent = (Event) listReminders;
                    }
                }
                break;
            case 5:

            }
        }while(menuSelect != 6);
    }
}