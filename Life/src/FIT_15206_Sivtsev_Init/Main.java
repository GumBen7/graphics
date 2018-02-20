package FIT_15206_Sivtsev_Init;

import ru.nsu.fit.group_15206.sivtsev.controller.Config;
import ru.nsu.fit.group_15206.sivtsev.controller.Controller;
import ru.nsu.fit.group_15206.sivtsev.parser.Parser;
import ru.nsu.fit.group_15206.sivtsev.view.View;
import ru.nsu.fit.group_15206.sivtsev.view.swing.MainFrame;
import ru.nsu.fit.group_15206.sivtsev.view.swing.SwingView;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;
import java.io.Reader;

public class Main extends MainFrame{

    public Main(Config config){
        super(600,600, "Init application");
        try{
            add(new SwingView(config));
        }
        catch (Exception e){
        }
    }

    public static void main(String args[]) {
        Reader reader;
        reader = null;
        //reader = getReader("Data");
        Main mainFrame = new Main(Parser.parseFromReader(reader));
        mainFrame.setVisible(true);
        Controller controller = new Controller(Parser.parseFromReader(reader), (View) mainFrame.getComponent(0)); //?????
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
