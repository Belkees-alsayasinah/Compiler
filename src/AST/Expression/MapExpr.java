package AST.Expression;

import AST.Node.DataType;
import AST.Node.NodeType;
import AST.Widget.KeyValue;

import java.util.ArrayList;
import java.util.List;

public class MapExpr extends Expression{
    List<MapObject> mapObjects;

    public MapExpr(List<MapObject> mapObjects,int lineNumber) {
        this.mapObjects = mapObjects;
        this.lineNumber = lineNumber;
        this.nodeName = "Map";
        this.nodeType = NodeType.Expression;
        this.expressionDataType = DataType.Map;
    }

    public void AddExpression(MapObject expression){
        this.mapObjects.add(expression);
        this.childCount++;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        for (MapObject child : this.mapObjects){
            stringBuilder.append(child);
            stringBuilder.append("\n");
        }
        if(mapObjects.isEmpty()){
            stringBuilder.append("[]");
        }
        return ", MapObjets=\n" + stringBuilder +
                "\n}";
    }

    @Override
    public String codeGeneration() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("array(");
        for (int i = 0; i < mapObjects.size(); i++) {
            MapObject mapObject = mapObjects.get(i);
            String key = mapObject.getKey().codeGeneration();
            String value = mapObject.getValue().codeGeneration();
            stringBuilder.append(key).append(" => ").append(value);
            if (i != mapObjects.size() - 1) {
                stringBuilder.append(", ");
            }
        }
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}
