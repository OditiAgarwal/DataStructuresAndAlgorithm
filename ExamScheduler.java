import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class ExamScheduler {
     public static void main(String[] args) {
        ExamScheduler examScheduler = new ExamScheduler();

        Course mathCourse = Course.createCourseFromUserInput();
        examScheduler.addCourse(mathCourse);

        // Add more courses if needed

        examScheduler.scheduleExams();

        Schedule schedule = examScheduler.getSchedule();
        System.out.println("Exam Schedule: " + schedule.getSchedule());
 Map<String, Course> courses;
Schedule schedule;
}
}

class CourseTT {
    private String name;
    private List<String> classes;
    private List<String> tutorials;
    private List<String> labs;
    private List<String> lectures;

    public CourseTT(String name) {
        this.name = name;
        this.classes = new ArrayList<>();
        this.tutorials = new ArrayList<>();
        this.labs = new ArrayList<>();
        this.lectures = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public List<String> getClasses() {
        return classes;
    }

    public List<String> getTutorials() {
        return tutorials;
    }

    public List<String> getLabs() {
        return labs;
    }

    public List<String> getLectures() {
        return lectures;
        public static Course createCourseFromUserInput() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the course name:");
        String name = scanner.nextLine();

        Course course = new Course(name);

        System.out.println("Enter the classes (comma-separated):");
        String classesInput = scanner.nextLine();
        course.getClasses().addAll(Arrays.asList(classesInput.split(",")));

        System.out.println("Enter the tutorials (comma-separated):");
        String tutorialsInput = scanner.nextLine();
        course.getTutorials().addAll(Arrays.asList(tutorialsInput.split(",")));

        System.out.println("Enter the labs (comma-separated):");
        String labsInput = scanner.nextLine();
        course.getLabs().addAll(Arrays.asList(labsInput.split(",")));

        System.out.println("Enter the lectures (comma-separated):");
        String lecturesInput = scanner.nextLine();
        course.getLectures().addAll(Arrays.asList(lecturesInput.split(",")));

        return course;
    }
}

class Schedule {
    private Map<String, List<String>> schedule;

    public Schedule() {
        this.schedule = new HashMap<>();
    }

    public void addSlot(String day, String slot) {
        if (!schedule.containsKey(day)) {
            schedule.put(day, new ArrayList<>());
        }
        schedule.get(day).add(slot);
    }

    public Map<String, List<String>> getSchedule() {
        return schedule;
    }
}



    public ExamScheduler() {
        this.courses = new HashMap<>();
        this.schedule = new Schedule();
    }

    public void addCourse(Course course) {
        courses.put(course.getName(), course);
    }

    public void scheduleExams() {
        for (Course course : courses.values()) {
            scheduleCourse(course);
        }
    }

    private void scheduleCourse(Course course) {
        // Schedule classes
        for (String classSlot : course.getClasses()) {
            schedule.addSlot("Day1", classSlot); // Change Day1 to actual day names
        }

        // Schedule tutorials
        for (String tutorialSlot : course.getTutorials()) {
            schedule.addSlot("Day2", tutorialSlot); // Change Day2 to actual day names
        }

        // Schedule labs
        for (String labSlot : course.getLabs()) {
            schedule.addSlot("Day3", labSlot); // Change Day3 to actual day names
        }

        // Schedule lectures
        for (String lectureSlot : course.getLectures()) {
            schedule.addSlot("Day4", lectureSlot); // Change Day4 to actual day names
        }
    }

    public Schedule getSchedule() {
        return schedule;
    }

    public static void main(String[] args) {
        ExamScheduler examScheduler = new ExamScheduler();

        Course mathCourse = new Course("Math");
        mathCourse.getClasses().add("1st");
        mathCourse.getTutorials().add("1st");
        mathCourse.getTutorials().add("6th");
        mathCourse.getLabs().add("1st");
        mathCourse.getLabs().add("2nd");
        mathCourse.getLectures().add("7th");
        mathCourse.getLectures().add("12th");

        examScheduler.addCourse(mathCourse);
        examScheduler.scheduleExams();

        Schedule schedule = examScheduler.getSchedule();
        System.out.println("Exam Schedule: " + schedule.getSchedule());
    }
}
