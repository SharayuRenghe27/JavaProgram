package Task.Nov.static_wrapper_exception;

public class enumex {
    public static void main(String[] args) {
        System.out.println(Days.sunday);
        System.out.println(Days.monday);
        System.out.println(url.google);
        System.out.println(url.vwo);
    }
}
enum Days{
    sunday,monday,tuesday,wednesday,thursday,friday,saturday
        }

enum url{
    google,vwo,katalon
}
