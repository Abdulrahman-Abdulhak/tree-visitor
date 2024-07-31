package visitor;

import java.util.ArrayList;
import java.util.List;

public class Node {
    Object value;
    List<Path> paths;
    double heuristic;

    public Node() {
        this("unknown", new ArrayList<>(), 0);
    }
    public Node(Object value) {
        this(value, new ArrayList<>(), 0);
    }
    public Node(Object value, double heuristic) {
        this(value, new ArrayList<>(), heuristic);
    }
    public Node(Object value, List<Path> paths) {
        this(value, paths, 0);
    }
    public Node(Object value, List<Path> paths, double heuristic) {
        this.value = value;
        this.paths = paths;
        this.heuristic = heuristic;
    }
}
