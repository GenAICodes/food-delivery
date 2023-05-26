
CREATE TABLE order_history (
  id BIGINT NOT NULL AUTO_INCREMENT,
  user_id BIGINT NOT NULL,
  order_id BIGINT NOT NULL,
  order_date TIMESTAMP NOT NULL,
  total_amount DOUBLE NOT NULL,
  PRIMARY KEY (id)
);
