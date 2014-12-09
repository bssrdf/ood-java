public interface AENode{
    public double evaluate() throws EvaluationException;
}

public class AEValueNode implements AENode{
    private double value;
    public AEValueNode(double value){
        this.value = value;
    }
    public AEValueNode(){

    }
    public double evaluate() throws EvaluationException{
        return value;
    }
}

public abstract class AEBinaryOperatorNode implements AENode{
    protected AENode left, right;
    public AEBinaryOperatorNode(AENode left, AENode right){
        this.left = left;
        this.right = right;
    }
    public AEBinaryOperatorNode(){
        this.left = null;
        this.right = null;
    }
    public abstract double evaluate() throws EvaluationException;
}

public abstract class AENaryOperatorNode implements AENode{
    protected List<AENode> children;
    public AENaryOperatorNode(List<AENode> children){
        this.children = children;
    }
    public AENaryOperatorNode(){
        children = new ArrayList<AENode>();
    }
    public abstract double evaluate() throws EvaluationException;
}

public class AEAdditionNode extends AEBinaryOperatorNode{
    public AEAdditionNode(AENode node1, AENode node2){
        super(node1, node2);
    }
    public double evaluate() throws EvaluationException{
        if (left!=null && right !=null){
            return left.evaluate()+right.evaluate();
        }
        throw new EvaluationException();
    }
}

public class AEAverageNode extends AENaryOperatorNode{
    public AENaryOperatorNode(List<AENode> children){
        super(children);
    }
    public double evaluate() throws EvaluationException{
        double sum = 0;
        for(AENode node: children){
            sum += node.evaluate();
        }
        return (sum/children.size());
    }
}

public class Tester{
    public static void main(String[] args) throws Exception{
        // AENode root = new AEAdditionNode(node1, node2);
        System.out.println(root.evaluate());
    }
}
