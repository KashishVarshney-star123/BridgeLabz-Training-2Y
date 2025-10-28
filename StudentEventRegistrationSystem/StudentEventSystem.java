import java.util.*;

class Participant<T> {
    private T rollNumber;
    private String name;
    private String branch;

    public Participant(T rollNumber, String name, String branch) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.branch = branch;
    }

    public T getRollNumber() {
        return rollNumber;
    }

    public String getName() {
        return name;
    }

    public String getBranch() {
        return branch;
    }

    @Override
    public String toString() {
        return "Roll No: " + rollNumber + ", Name: " + name + ", Branch: " + branch;
    }
}

class EventRegistrationSystem {
    private final int MAX_CAPACITY;
    private ArrayList<Participant<Integer>> registeredList;
    private LinkedList<Participant<Integer>> waitingList;
    private HashSet<Integer> rollNumberSet;

    public EventRegistrationSystem(int capacity) {
        this.MAX_CAPACITY = capacity;
        registeredList = new ArrayList<>();
        waitingList = new LinkedList<>();
        rollNumberSet = new HashSet<>();
    }

    public void registerParticipant(Participant<Integer> participant) {
        if (rollNumberSet.contains(participant.getRollNumber())) {
            System.out.println("Duplicate roll number. Registration failed.");
            return;
        }

        rollNumberSet.add(participant.getRollNumber());

        if (registeredList.size() < MAX_CAPACITY) {
            registeredList.add(participant);
            System.out.println("Registered: " + participant);
        } else {
            waitingList.add(participant);
            System.out.println("Added to waiting list: " + participant);
        }
    }

    public void cancelRegistration(int rollNumber) {
        Participant<Integer> toRemove = null;

        for (Participant<Integer> p : registeredList) {
            if (p.getRollNumber().equals(rollNumber)) {
                toRemove = p;
                break;
            }
        }

        if (toRemove != null) {
            registeredList.remove(toRemove);
            rollNumberSet.remove(rollNumber);
            System.out.println("Cancelled registration: " + toRemove);

            if (!waitingList.isEmpty()) {
                Participant<Integer> movedUp = waitingList.removeFirst();
                registeredList.add(movedUp);
                System.out.println("Moved from waiting list to registered: " + movedUp);
            }
        } else {
            System.out.println("Roll number not found in registered list.");
        }
    }

    public void displayParticipants() {
        System.out.println("Registered Participants:");
        for (Participant<Integer> p : registeredList) {
            System.out.println(p);
        }

        System.out.println("Waiting List:");
        for (Participant<Integer> p : waitingList) {
            System.out.println(p);
        }
    }
}
public class StudentEventSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        EventRegistrationSystem system = new EventRegistrationSystem(3);

        while (true) {
            System.out.println("\n--- Student Event Registration Menu ---");
            System.out.println("1. Register Participant");
            System.out.println("2. Cancel Registration");
            System.out.println("3. Display Participants");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter Roll Number: ");
                    int roll = scanner.nextInt();
                    scanner.nextLine(); 
                    System.out.print("Enter Name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter Branch: ");
                    String branch = scanner.nextLine();
                    Participant<Integer> p = new Participant<>(roll, name, branch);
                    system.registerParticipant(p);
                    break;

                case 2:
                    System.out.print("Enter Roll Number to Cancel: ");
                    int cancelRoll = scanner.nextInt();
                    system.cancelRegistration(cancelRoll);
                    break;

                case 3:
                    system.displayParticipants();
                    break;

                case 4:
                    System.out.println("Have a great day!");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }
}