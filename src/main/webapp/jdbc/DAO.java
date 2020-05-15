package main.webapp.jdbc;

import java.util.List;

public interface DAO {
    public int getTotal();

    public void add(Hero hero);

    public void delete(Hero hero);

    public void update(Hero hero);

    public List<Hero> list();

    public List<Hero> list(int start,int count);

}
