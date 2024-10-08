package pojos.users;

import pojos.Meta;

public class Users {
    private String code;

    private Data[] data;

    private Meta meta;

    public String getCode () {
        return code;
    }

    public void setCode (String code) {
        this.code = code;
    }

    public Data[] getData () {
        return data;
    }

    public void setData (Data[] data) {
        this.data = data;
    }

    public Meta getMeta () {
        return meta;
    }

    public void setMeta (Meta meta) {
        this.meta = meta;
    }

    @Override
    public String toString () {
        return "ClassPojo [code = " + code + ", data = " + data + ", meta = " + meta + "]";
    }
}
