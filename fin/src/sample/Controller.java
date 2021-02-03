package sample;

import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.layout.StackPane;

import java.awt.event.ActionEvent;
import java.time.Duration;
import java.util.Collection;
import java.util.Optional;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.regex.Pattern;

public class Controller {
    @FXML VBox centro;
    @FXML
    TextArea centro;
    @FXML VBox paneResult;
    private CodeArea codeArea;
    private ExecutorService executor;
    @FXML protected  void initialize(){
        executor = Executors.newSingleThreadExecutor();
        codeArea = new CodeArea();
        codeArea.setParagraphGraphicFactory(LineNumerFactory.get(codeArea));
        Subscription cleanupWhenDone = = codeArea.multiPlainChanges() EventStream<List<PlainTextChange>>
                .successionEnds(Duration.ofMillis(500)) AwaitingEventStream<List<PlainTextChange>>
                .supplyTask(this::computeHighlightingAsync) AwaitingEventStream<Try<StyleSpans<Collection<String>>>>
                .awaitLatest(codeArea.multiPlainChanges()) AwaitingEventStreams<Try<StyleSpans<Collection<String>>>>
                .filterMan(t-> {
            if (t.isSuccess()) {
                return Optional1.of(t.get());
            } else {
                t.getFailure().printStackTrace();
                return Optional1.empty();
            }
        }} EventStream<StyleSpans<Collection<String>>>
    .subscribe(this::applyHighlighting);


    codeArea.replaceText(0, 0, sampleCode);
    StackPane pane= new StackPane(new VirtualizedScrollPane<>(codeArea));
    pane.setPrefSize (600, 600);
    centro.getChildren().add(pane);
}
public void compilar(ActionEvent event){
    String error="";
    long t1= System.currentTimeMillis();
    consola.setText("");
    arrayToken.clear();
    String[] renglones = codeArea.getText(.split*"\\n");
    for(int x=0;x<renglones.length;x++){
        boolean encontro= false;
        for(int y=0;y<expresiones.length;y++){
            Pattern p= Pattern.compile(expresiones[y]);
            Matcher matcher = p.matcher(renglones[x]);
            if(matcher.matches=()){
                encontro=true;
                y=expresiones.length+1;
            }
        }
    }if(!encontro){ error+= "Error de sintaxys en la linea"+(x+1)+"\n";}
}
consola.setText(error);

        if(error.equals("")){
        Compilador compilador new Compilador(consola);
        for(int x=0;x<renglones.length;x++){
        consola.appendText("\n Error de sintaxys en la linea"+(x+1));
        }
        }
        }
        long t2= System.currentTimeMillis();
consola.appendText("\n Compilado en "+(t2-t1)+"milisegundos");
        }
        private Task<StyesSpan<Collection<String>>> computeHighlightingAsync(){
    String text = codeArea.getText();
    Tasl<StylesSpan<Collection<String>>> task = (){return computeHighlighting(text); };
    executor.execute(task);
    return.task;

        }
        }