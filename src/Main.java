import java.io.File;

public class Main {
    public static void main(String[] args) {
        StringBuilder str = new StringBuilder("");
        File path = new File("D:\\basedir");
        find(path, str);
        System.out.println("");

    }

    public static StringBuilder find(File f, StringBuilder s) {
        StringBuilder str_add = s;
        if (f == null) {
            return str_add;
        }
        for (File file : f.listFiles()) {
            //System.out.println(file.toString());
            if (file.listFiles()==null){
                str_add.append(file.toString());
                str_add.append("\n");
                System.out.println(str_add);
            } else {
                find(file, str_add);
            }



        }

        return str_add;
    }
}



