import java.time.LocalDateTime;

public class Assignment {
    LocalDateTime date;
    Main.Courses course;
    Main.Category category;
    int priority;

    public Assignment(LocalDateTime localDateTime, Main.Courses courses, Main.Category categories, int priorities) {
        date = localDateTime;
        course = courses;
        category = categories;
        priority = priorities;
    }

    @Override
    public String toString() {
        return "\nDate: " + date + "\nCourse: " + course + "\n" + category;
    }

    // Override equals method
    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    



}
