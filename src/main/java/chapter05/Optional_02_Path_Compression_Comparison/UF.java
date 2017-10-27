package chapter05.Optional_02_Path_Compression_Comparison;

// 我们设计一个UF的接口，让不同的UF实现具体实现这个接口
public interface UF {

    public boolean isConnected(int p, int q);
    public void unionElements(int p, int q);
}
