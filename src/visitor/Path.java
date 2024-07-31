package visitor;

public class Path {
    Node to;
    double cost;

    public Path() {
        this(null, 0);
    }
    public Path(Node toNode) {
        this(toNode, 0);
    }
    public Path(Node toNode, double cost) {
        to = toNode;
        this.cost = cost;
    }

    public double getCost() {
        return cost;
    }
    public void setCost(double cost) {
        this.cost = cost;
    }

    public Node getEnd() {
        return to;
    }
    public void setEnd(Node node) {
        to = node;
    }
}
