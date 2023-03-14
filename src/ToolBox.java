import java.util.ArrayList;

public class ToolBox {
    private ArrayList<Tool> toolsLst;
    public ToolBox(){
        toolsLst = new ArrayList<>();
    }
    public void addTool(Tool tool){
        toolsLst.add(tool);
    }
    public void useTool(Tool tool){
        tool.useTool();
    }
}
