import java.util.List;
import java.util.Set;

public class DFSGRAPH {

    public void DFS(int source, Set<Integer> vis)
    {
        System.out.println(source);
        vis.add(source);
        List<Integer> neighbourlist =obj.get(source);
        for(int neighbour:neighbourlist)
        {
            if(!vis.contains(neighbour))
            {
                DFS(neighbour,vis);
            }
        }
    }
}
