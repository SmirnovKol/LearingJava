# jar package: c3p0, commons-dbutils, mchange.  Use c3p0-config.xml to configure the information about the database
# function: seach a bookstore in MySQL database, the table bookstore has 3 columns: name, price, category
# the core methods is as follows:
	
	public List<Book> findByCategory(int category) {
		DataSource ds = new ComboPooledDataSource();
		QueryRunner queryRunner = new QueryRunner(ds);
		String sql = "select * from bookstore where category=?";
		try {
			List<Book> result = queryRunner.query(sql, new ResultSetHandler<List<Book>>() {

				@Override
				public List<Book> handle(ResultSet rs) throws SQLException {
					List<Book> list = new LinkedList<Book>();
					while (rs.next()) {
						String name = rs.getString("name");
						double price = rs.getDouble("price");
						int category = rs.getInt("category");
						list.add(new Book(name, price, category));
					}
					return list;
				}
				
			}, category);
			return result;
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}
