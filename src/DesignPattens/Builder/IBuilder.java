package DesignPattens.Builder;
//Builder
public interface IBuilder {
    void startOperation();
    void buildBody();
    void insertWheel();
    Product getproduct();
}
