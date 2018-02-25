package com.kh.openapi.model.designMode.desker;

/**
 * 所在的包名: com.kh.openapi.model.designMode.desker
 * 所在的项目名：kh-openapi
 *
 * @Author:xukh
 * @Description:
 * @Date: Created in 16:53 2018/2/25
 */
public class DesignImpl implements DesignDao{

    private DesignDao designDao;

    public DesignImpl(DesignDao designDao) {
        this.designDao = designDao;
    }

    @Override
    public void add() {
        System.out.println(System.currentTimeMillis());
        designDao.add();
        System.out.println(System.currentTimeMillis());
    }

    @Override
    public void insert() {
        System.out.println(System.currentTimeMillis());
        designDao.insert();
        System.out.println(System.currentTimeMillis());
    }

    @Override
    public void update() {
        System.out.println(System.currentTimeMillis());
        designDao.update();
        System.out.println(System.currentTimeMillis());
    }

    public static void main(String[] args) {
        DesignDao dao = new DesignImpl(new DesignDaoImpl());
        DesignImpl design = new DesignImpl(new DesignDaoImpl());
        DesignDaoImpl designDao = new DesignDaoImpl();

        design.insert();

    }
}
