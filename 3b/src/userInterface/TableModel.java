package userInterface;

import java.util.Vector;

import javax.swing.table.AbstractTableModel;

import Classes.Course;


public class TableModel extends AbstractTableModel {
	private Vector<String> cNames;	
	private Vector<Object> data;
	
	public TableModel( Vector<Object> data){
		super();
		this.data = data;
		loadData();
	}
	public void setData(Vector<Object> data){
		this.data = data;
	}
	public void addItem(Course course ){
		data.add(course);
	}
	
	@Override
	public String getColumnName(int c){
		return cNames.get(c);
	}
	@Override
	public int getColumnCount() {
		
		return cNames.size();
	}

	@Override
	public int getRowCount() {
		
		return data.size();
	}

	@Override
	public Object getValueAt(int x, int y) {
		switch(y){
		case 0 : return (((Course) data.get(x)).getDept());
		case 1 : return (((Course) data.get(x)).getCode());
		}
		return "";
	}
	

	private void loadData() {
		String[] colums = new String[] {
				"Subject", "CRN", "Days", "Hours", "ID", "Notes"
			};
		cNames	 = new Vector<String>(); 
		for(int i=0; i<colums.length; i++)
			cNames.add(colums[i]);
		
	}
}