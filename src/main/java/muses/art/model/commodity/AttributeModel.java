package muses.art.model.commodity;


import java.util.List;

public class AttributeModel {

    private Integer id;

    private String name;

    private boolean imageFlag;

    private List<ParameterModel> parameters; // 若删除参数，则其所属属性可以级联删除

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isImageFlag() {
        return imageFlag;
    }

    public void setImageFlag(boolean imageFlag) {
        this.imageFlag = imageFlag;
    }

    public List<ParameterModel> getParameters() {
        return parameters;
    }

    public void setParameters(List<ParameterModel> parameters) {
        this.parameters = parameters;
    }
}
