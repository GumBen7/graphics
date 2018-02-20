package FIT_15206_Sivtsev_Init;

import ru.nsu.fit.group_15206.sivtsev.controller.Controller;
import ru.nsu.fit.group_15206.sivtsev.parser.Parser;
import ru.nsu.fit.group_15206.sivtsev.view.swing.MainFrame;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;
import java.io.Reader;

public class Main extends MainFrame{

    public Main(){
        super(600,600, "Init application");
    }

    public static void main(String args[]) {
        Main mainFrame = new Main();
        mainFrame.setVisible(true);
        Reader reader;
        reader = null;
        reader = null;
        //reader = getReader("Data");
        Controller controller = new Controller(Parser.parseFromReader(reader));
        controller.init(10);
    }

    public static Reader getReader(String fileName){
        Reader reader = null;
        try{
            reader = new InputStreamReader(new FileInputStream(fileName));
        }
        catch (FileNotFoundException e){
            System.err.println("Something went wrong while opening file:" + e.getLocalizedMessage());
        }
        return reader;
    }
}
