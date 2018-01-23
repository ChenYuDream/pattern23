package com.chenyu;

import java.io.*;

/**
 * deepClone 深克隆
 *
 * @author yu_chen
 * @create 2018-01-23 18:06
 **/
public class Car implements Serializable {


    private static final long serialVersionUID = -1589323010419939462L;
    private String name;

    /**
     * 深克隆
     *
     * @return
     * @throws ClassNotFoundException
     * @throws IOException
     */
    protected Object deepClone() throws ClassNotFoundException, IOException {
        //将对象写到流里
        ByteArrayOutputStream bo = new ByteArrayOutputStream();
        ObjectOutputStream oo = new ObjectOutputStream(bo);
        oo.writeObject(this);
        //从流里读出来
        ByteArrayInputStream bi = new ByteArrayInputStream(bo.toByteArray());
        ObjectInputStream oi = new ObjectInputStream(bi);
        return (oi.readObject());

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
