package com.example.Calling.Rest;

import com.example.Calling.Rest.rest.User;
import com.example.Calling.Rest.rest.UsersService;
import com.vaadin.flow.component.grid.Grid;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;

@Route("")
public class UserList extends VerticalLayout {

    public UserList(UsersService usersService) {

        var grid = new Grid<User>(User.class);
        grid.setItems(usersService.getUsers());
        grid.setColumns("name","phone","email","website","company.name");

        add(grid);
    }
}
