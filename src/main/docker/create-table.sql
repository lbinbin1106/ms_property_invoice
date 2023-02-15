create table property_invoice
(
id serial primary key,
invoice_id text not null,
invoice_value numeric not null,
invoice_date date not null,
invoice_memo text not null
);
