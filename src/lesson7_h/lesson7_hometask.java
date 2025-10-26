package lesson7_h;

public class lesson7_hometask {// Класс для представления пациента
    public static void main(String[] args) {
        // Создаем объекты врачей
        Surgeon surgeon = new Surgeon();
        Therapist therapist = new Therapist();
        Dentist dentist = new Dentist();

        // Создаем объект пациента
        Patient patient1 = new Patient("Иван Иванов", "1");
        Patient patient2 = new Patient("Мария Петрова", "2");
        Patient patient3 = new Patient("Петр Сидоров", "3");

        // Запускаем процесс лечения через терапевта
        therapist.assignDoctorAndTreat(patient1, surgeon, dentist);
        therapist.assignDoctorAndTreat(patient2, surgeon, dentist);
        therapist.assignDoctorAndTreat(patient3, surgeon, dentist);
    }

    //класс пациента
    static class Patient {
        String name;
        String healingPlan;
        Doctor assignedDoctor;

        public Patient(String name, String treatmentPlan) {
            this.name = name;
            this.healingPlan = treatmentPlan;
        }
    }

    // Абстрактный класс для всех врачей
    abstract static class Doctor {
        String specialization;

        abstract void treat(Patient patient);
    }

    // Класс Хирурга
    static class Surgeon extends Doctor {
        public Surgeon() {
            this.specialization = "Хирург";
        }

        @Override
        void treat(Patient patient) {
            System.out.println(this.specialization + " лечит пациента " + patient.name);
        }
    }

    // Класс Терапевта
    static class Therapist extends Doctor {
        public Therapist() {
            this.specialization = "Терапевт";
        }

        @Override
        void treat(Patient patient) {
            System.out.println(this.specialization + " лечит пациента " + patient.name);
        }

        // Метод для назначения врача
        public void assignDoctorAndTreat(Patient patient, Surgeon surgeon, Dentist dentist) {
            if ("1".equals(patient.healingPlan)) {
                patient.assignedDoctor = surgeon;
                System.out.println("Назначен хирург для пациента " + patient.name);
                patient.assignedDoctor.treat(patient);
            } else if ("2".equals(patient.healingPlan)) {
                patient.assignedDoctor = dentist;
                System.out.println("Назначен дантист для пациента " + patient.name);
                patient.assignedDoctor.treat(patient);
            } else {
                patient.assignedDoctor = this;
                System.out.println("Назначен терапевт для пациента " + patient.name);
                patient.assignedDoctor.treat(patient);
            }
        }
    }

    // Класс Дантиста
    static class Dentist extends Doctor {
        public Dentist() {
            this.specialization = "Дантист";
        }

        @Override
        void treat(Patient patient) {
            System.out.println(this.specialization + " лечит пациента " + patient.name);
        }
    }


}
