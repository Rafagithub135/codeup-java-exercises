public class ServerNameGenerator {

    public static String[] adjectives = {"big", "small", "tall", "short", "long", "round", "square", "fat", "skinny", "slim"};

    public static String[] nouns = {"table", "chair", "desk", "lamp", "book", "pen", "pencil", "cup", "bottle", "computer"};

    public static String randomElement(String[] array ){
        int random = (int) (Math.random() * array.length);
        return array[random];
    }


    public static void main(String[] args) {
        System.out.println("Here is your server name:");
        System.out.println(randomElement(adjectives) + "-" + randomElement(nouns));
    }
}
