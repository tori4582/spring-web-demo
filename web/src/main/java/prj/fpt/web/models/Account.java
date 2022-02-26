package prj.fpt.web.models;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Account {
	private int id;
    private String user;
    private String pass;
    private int isSell;
    private int isAdmin;
}
