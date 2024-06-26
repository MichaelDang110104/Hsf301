﻿		-- Insert dummy data into CUSTOMER table
	INSERT INTO CUSTOMER (Email, Password, LastName, FirstName, Address, PhoneNumber, Points, Status) VALUES
	('john.doe@yahoo.com', '123', 'Doe', 'John', '123 Main St', '+1 (212) 555-0198', 1000, 1),
	('jane.smith@gmail.com', '123', 'Smith', 'Jane', '456 Elm St', '+1 (415) 555-0234', 1500, 1),
	('cxhrisB124@gmail.com', '123', 'Chris', 'Burkerly', '789 Oak St', '+1 (310) 555-0745', 2000, 1),
	('emma.watson@gmail.com', '123', 'Watson', 'Emma', '101 Pine St', '+1 (617) 555-0987', 800, 1),
	('oliver.queen@gmail.com', '123', 'Queen', 'Oliver', '202 Cedar St', '+1 (818) 555-0367', 300, 1),
	('lee1103@gmail.com', '123', 'Lee', 'Bruce', '303 Birch St', '+1 (305) 555-0456', 3500, 1),
	('clark08kent@gmail.com', 'clark0809', 'Kent', 'Clark', '404 Maple St', '+1 (702) 555-0823', 200, 1);

	-- Insert dummy data into EMPLOYEE table
	-- Insert dummy data into EMPLOYEE table with updated roles
	INSERT INTO EMPLOYEE (Role, Email, Password, LastName, FirstName, Address, PhoneNumber, Status) VALUES
	('Admin', 'RaveAdmin@gmail.com', '123', 'Steve', 'Ravy', '789 Pine St', '+1 (202) 555-0178', 1),
	('Manager', 'SmithManager@gmail.com', '123', 'Smith', 'John', '101 Oak St', '+1 (303) 555-0192', 1),
	('SalesStaff', 'BrownSales@gmail.com', '123', 'Sarah', 'Brown', '123 Elm St', '+1 (404) 555-0153', 1),
	('DeliveryStaff', 'DanielDelivery@gmail.com', '123', 'Moore', 'Daniel', '456 Birch St', '+1 (505) 555-0147', 1),
	('SalesStaff', 'AmandaSale02@gmail.com', '123', 'Taylor', 'Amanda', '789 Cedar St', '+1 (707) 555-0185', 1),
	('Manager', 'JamesManager02@gmail.com', '123', 'Davis', 'James', '101 Maple St', '+1 (808) 555-0136', 1),
	('Admin', 'JessicaAdmin2@gmail.com', '123', 'Miller', 'Jessica', '202 Oak St', '+1 (315) 555-0176', 1),
	('DeliveryStaff', 'BobbyDelivery@gmail.com', '123', 'Demer', 'Bobby', '412 OakHill St', '+1 (505) 613-0457', 1);

	-- Insert dummy data into PROMOTION table
	INSERT INTO PROMOTION ([Name], Amount, ValidFrom, ValidTo, [Description], Code, , Status) VALUES
	('Spring Sale', 20.00, GETDATE(), DATEADD(month, 1, GETDATE()), '20% off all items for Spring', 'SPRING20',  1),
	('Summer Sale', 15.00, GETDATE(), DATEADD(month, 2, GETDATE()), '15% off all items for Summer', 'SUMMER15',  1),
	('Fall Sale', 10.00, GETDATE(), DATEADD(month, 3, GETDATE()), '10% off all items for Fall', 'FALL10', 1),
	('Winter Sale', 25.00, GETDATE(), DATEADD(month, 4, GETDATE()), '25% off all items for Winter', 'WINTER25', 1),
	('Black Friday', 30.00, GETDATE(), DATEADD(month, 5, GETDATE()), '30% off all items for Black Friday', 'BLACKFRIDAY30', 1),
	('Cyber Monday', 35.00, GETDATE(), DATEADD(month, 6, GETDATE()), '35% off all items for Cyber Monday', 'CYBERMONDAY35',  1),
	('Holiday Special', 40.00, GETDATE(), DATEADD(month, 7, GETDATE()), '40% off all items for the Holidays', 'HOLIDAY40', 1);

	-- Insert dummy data into PURCHASEORDER table
	INSERT INTO PURCHASEORDER (UserID, [Date], PaymentMethod, Name, PhoneNumber, ShippingAddress, TotalPrice, [OrderStatus], PromotionID, PayWithPoint, Note,SaleStaff,DeliveryStaff) VALUES
	(1, GETDATE(), 'Credit Card', 'John Doe', '123-456-7890', '123 Main St', 200.00, 'Pending', 1, 0, 'Shipping with packaging',3,4),
	(2, GETDATE(), 'PayPal', 'Jane Smith', '234-567-8901', '456 Elm St', 300.00, 'Pending', 2, 1, 'Ship at D2',3,8),
	(3, GETDATE(), 'Credit Card', 'Alice Johnson', '345-678-9012', '789 Oak St', 150.00, 'Pending', 3, 0, 'Shipping without packaging',3,8),
	(4, GETDATE(), 'PayPal', 'Bob Brown', '456-789-0123', '101 Pine St', 250.00, 'Pending', 4, 1, 'Shipping with packaging',5,4),
	(5, GETDATE(), 'Credit Card', 'Carol White', '567-890-1234', '202 Cedar St', 350.00, 'Pending', 5, 0, 'Shipping with packaging',5,4),
	(6, GETDATE(), 'PayPal', 'David Black', '678-901-2345', '303 Birch St', 400.00, 'Pending', 6, 1, 'Shipping with packaging',3,4),
	(7, GETDATE(), 'Credit Card', 'Eve Green', '789-012-3456', '404 Maple St', 450.00, 'Pending', 7, 0, 'Shipping with packaging',5,8);
	
	-- Insert dummy data into CATEGORY table
	INSERT INTO CATEGORY ([Name], Status) VALUES
	('Rings', 1),
	('Earrings', 1),
	('Bracelets', 1),
	('Necklaces', 1),
	('Wedding Rings', 1),
	('Wedding Earrings', 1),
	('Wedding Bracelets',1),
	('Wedding Necklaces',1),
	('Engagement Rings',1);

		-- Insert dummy data into SHELLMATERIAL table
	INSERT INTO SHELLMATERIAL ([Name], AmountAvailable, Status) VALUES
	('Silver', 100.00, 1),
	('Gold', 100.00, 1),
	('Rose Gold', 150.00, 1),
	('White Gold', 120.00, 1);

	-- Insert dummy data into DIAMOND table
	INSERT INTO DIAMOND (Shape,Color, Clarity, Carat, Cut, CertificateScan, AmountAvailable, Status)
	VALUES('Round','F', 'VVS2', 1.03, 'Super Ideal', 'https://css.brilliantearth.com/static/img/diamond_shape_new/round_new.jpg',10, 1),
	('Round','G', 'VVS2', 1.00, 'Super Ideal', 'https://css.brilliantearth.com/static/img/diamond_shape_new/round_new.jpg',5, 1),
	('Round','F', 'VVS2', 0.56, 'Super Ideal', 'https://css.brilliantearth.com/static/img/diamond_shape_new/round_new.jpg',20, 1),
	('Round','G', 'VS2', 1.20, 'Super Ideal', 'https://css.brilliantearth.com/static/img/diamond_shape_new/round_new.jpg', 3, 1),
	('Round','H', 'VS1', 2.01, 'Super Ideald', 'https://css.brilliantearth.com/static/img/diamond_shape_new/round_new.jpg',8, 1),
	('Round','I', 'VVS2', 0.31, 'Very Good', 'https://css.brilliantearth.com/static/img/diamond_shape_new/round_new.jpg',21, 1),
	('Oval', 'G', 'VS1', 1.50, 'Super Ideal', 'https://css.brilliantearth.com/static/img/diamond_shape_new/oval_new.jpg', 8, 1),
    ('Oval', 'J', 'VS1', 1.51, 'Ideal',  'https://css.brilliantearth.com/static/img/diamond_shape_new/oval_new.jpg', 12, 1),
    ('Oval', 'F', 'VS1', 1.00, 'Ideal', 'https://css.brilliantearth.com/static/img/diamond_shape_new/oval_new.jpg', 15, 1),
	('Oval', 'J', 'VS1', 1.51, 'Ideal', 'https://css.brilliantearth.com/static/img/diamond_shape_new/oval_new.jpg', 6, 1),
	('Oval', 'G', 'VVS2', 1.70, 'Ideal', 'https://css.brilliantearth.com/static/img/diamond_shape_new/oval_new.jpg', 3, 1),
    ('Oval', 'G', 'VS1', 1.50, 'Super Ideal','https://css.brilliantearth.com/static/img/diamond_shape_new/oval_new.jpg', 8, 1),
    ('Oval', 'F', 'VVS2', 1.00, 'Ideal', 'https://css.brilliantearth.com/static/img/diamond_shape_new/oval_new.jpg', 10, 1),
    ('Oval', 'F', 'VVS2', 1.01, 'Ideal', 'https://css.brilliantearth.com/static/img/diamond_shape_new/oval_new.jpg', 9, 1),
	('Emerald', 'F', 'VVS2', 1.30, 'Super Ideal', 'https://css.brilliantearth.com/static/img/diamond_shape_new/emerald_new.jpg', 10, 1),
    ('Emerald', 'G', 'VS1', 2.01, 'Super Ideal','https://css.brilliantearth.com/static/img/diamond_shape_new/emerald_new.jpg', 5, 1),
    ('Emerald', 'G', 'IF', 2.01, 'Ideal', 'https://css.brilliantearth.com/static/img/diamond_shape_new/emerald_new.jpg', 4, 1),
    ('Emerald', 'H', 'VVS2', 2.02, 'Ideal', 'https://css.brilliantearth.com/static/img/diamond_shape_new/emerald_new.jpg', 6, 1),
    ('Emerald', 'H', 'VVS1', 1.21, 'Ideal', 'https://css.brilliantearth.com/static/img/diamond_shape_new/emerald_new.jpg', 7, 1),
    ('Emerald', 'H', 'IF', 2.00, 'Super Ideal',  'https://css.brilliantearth.com/static/img/diamond_shape_new/emerald_new.jpg', 8, 1),
	('Cushion', 'H', 'VS2', 1.03, 'Super Ideal', 'https://css.brilliantearth.com/static/img/diamond_shape_new/cushion_new.jpg', 10, 1),
    ('Cushion', 'G', 'VVS1', 1.01, 'Super Ideal',  'https://css.brilliantearth.com/static/img/diamond_shape_new/cushion_new.jpg', 5, 1),
    ('Cushion', 'G', 'VVS2', 1.51, 'Super Ideal', 'https://css.brilliantearth.com/static/img/diamond_shape_new/cushion_new.jpg', 4, 1),
    ('Cushion', 'G', 'IF', 1.50, 'Super Ideal',  'https://css.brilliantearth.com/static/img/diamond_shape_new/cushion_new.jpg', 6, 1),
    ('Cushion', 'I', 'VS2', 2.01, 'Very Good',  'https://css.brilliantearth.com/static/img/diamond_shape_new/cushion_new.jpg', 7, 1),
    ('Cushion', 'G', 'VVS2', 1.51, 'Super Ideal',  'https://css.brilliantearth.com/static/img/diamond_shape_new/cushion_new.jpg', 8, 1),
    ('Cushion', 'I', 'VS1', 1.90, 'Super Ideal', 'https://css.brilliantearth.com/static/img/diamond_shape_new/cushion_new.jpg', 3, 1),
	('Pear', 'J', 'SI1', 3.01, 'Ideal', 'https://css.brilliantearth.com/static/img/diamond_shape_new/pear_new.jpg', 5, 1),
    ('Pear', 'I', 'SI1', 1.75, 'Ideal',  'https://css.brilliantearth.com/static/img/diamond_shape_new/pear_new.jpg', 4, 1),
    ('Pear', 'J', 'SI1', 0.96, 'Very Good', 'https://css.brilliantearth.com/static/img/diamond_shape_new/pear_new.jpg', 7, 1),
    ('Pear', 'F', 'VVS2', 1.02, 'Ideal', 'https://css.brilliantearth.com/static/img/diamond_shape_new/pear_new.jpg', 8, 1),
    ('Pear', 'F', 'VS1', 1.21, 'Ideal', 'https://css.brilliantearth.com/static/img/diamond_shape_new/pear_new.jpg', 6, 1),
    ('Pear', 'F', 'VS2', 1.43, 'Ideal','https://css.brilliantearth.com/static/img/diamond_shape_new/pear_new.jpg', 9, 1),
	('Radiant', 'J', 'VS2', 2.01, 'Super Ideal',  'https://css.brilliantearth.com/static/img/diamond_shape_new/radiant_new.jpg', 5, 1),
    ('Radiant', 'F', 'VVS1', 1.03, 'Ideal','https://css.brilliantearth.com/static/img/diamond_shape_new/radiant_new.jpg', 4, 1),
    ('Radiant', 'I', 'VS1', 2.01, 'Super Ideal', 'https://css.brilliantearth.com/static/img/diamond_shape_new/radiant_new.jpg', 6, 1),
    ('Radiant', 'H', 'VS1', 2.02, 'Super Ideal','https://css.brilliantearth.com/static/img/diamond_shape_new/radiant_new.jpg', 7, 1),
    ('Radiant', 'G', 'VVS1', 1.50, 'Ideal',  'https://css.brilliantearth.com/static/img/diamond_shape_new/radiant_new.jpg', 8, 1),
	('Princess', 'F', 'VVS2', 1.00, 'Super Ideal', 'https://css.brilliantearth.com/static/img/diamond_shape_new/princess_new.jpg', 10, 1),
    ('Princess', 'J', 'VVS1', 2.02, 'Super Ideal', 'https://css.brilliantearth.com/static/img/diamond_shape_new/princess_new.jpg', 5, 1),
    ('Princess', 'F', 'VS1', 0.80, 'Ideal', 'https://css.brilliantearth.com/static/img/diamond_shape_new/princess_new.jpg', 12, 1),
    ('Princess', 'F', 'VVS2', 1.01, 'Ideal', 'https://css.brilliantearth.com/static/img/diamond_shape_new/princess_new.jpg', 8, 1),
    ('Princess', 'G', 'VVS1', 1.51, 'Super Ideal', 'https://css.brilliantearth.com/static/img/diamond_shape_new/princess_new.jpg', 6, 1),
    ('Princess', 'G', 'VS1', 1.01, 'Ideal','https://css.brilliantearth.com/static/img/diamond_shape_new/princess_new.jpg', 7, 1),
    ('Princess', 'F', 'VVS1', 0.92, 'Super Ideal', 'https://css.brilliantearth.com/static/img/diamond_shape_new/princess_new.jpg', 9, 1),
	('Marquise', 'J', 'VS2', 1.00, 'Ideal', 'https://css.brilliantearth.com/static/img/diamond_shape_new/marquise_new.jpg', 5, 1),
    ('Marquise', 'G', 'VVS1', 0.53, 'Ideal','https://css.brilliantearth.com/static/img/diamond_shape_new/marquise_new.jpg', 10, 1),
    ('Marquise', 'F', 'SI1', 0.32, 'Ideal','https://css.brilliantearth.com/static/img/diamond_shape_new/marquise_new.jpg', 12, 1),
    ('Marquise', 'I', 'VS2', 0.50, 'Very Good', 'https://css.brilliantearth.com/static/img/diamond_shape_new/marquise_new.jpg', 8, 1),
    ('Marquise', 'G', 'VS1', 0.50, 'Ideal', 'https://css.brilliantearth.com/static/img/diamond_shape_new/marquise_new.jpg', 7, 1),
	('Asscher', 'J', 'VVS2', 1.01, 'Ideal',  'https://css.brilliantearth.com/static/img/diamond_shape_new/asscher_new.jpg', 5, 1),
    ('Asscher', 'F', 'VS1', 0.91, 'Super Ideal','https://css.brilliantearth.com/static/img/diamond_shape_new/asscher_new.jpg', 10, 1),
    ('Asscher', 'F', 'VVS2', 0.70, 'Ideal', 'https://css.brilliantearth.com/static/img/diamond_shape_new/asscher_new.jpg', 12, 1),
    ('Asscher', 'G', 'IF', 0.71, 'Ideal', 'https://css.brilliantearth.com/static/img/diamond_shape_new/asscher_new.jpg', 8, 1),
    ('Asscher', 'F', 'VS1', 0.51, 'Super Ideal', 'https://css.brilliantearth.com/static/img/diamond_shape_new/asscher_new.jpg', 7, 1),
    ('Asscher', 'F', 'VVS2', 1.00, 'Super Ideal', 'https://css.brilliantearth.com/static/img/diamond_shape_new/asscher_new.jpg', 9, 1),
	('Heart', 'F', 'VS1', 0.91, 'Ideal',  'https://css.brilliantearth.com/static/img/diamond_shape_new/heart_new.jpg', 5, 1),
    ('Heart', 'G', 'VS1', 0.90, 'Ideal', 'https://css.brilliantearth.com/static/img/diamond_shape_new/heart_new.jpg', 10, 1),
    ('Heart', 'F', 'VS2', 0.71, 'Ideal',  'https://css.brilliantearth.com/static/img/diamond_shape_new/heart_new.jpg', 12, 1),
    ('Heart', 'F', 'IF', 0.52, 'Ideal','https://css.brilliantearth.com/static/img/diamond_shape_new/heart_new.jpg', 8, 1),
    ('Heart', 'F', 'VVS2', 0.56, 'Very Good', 'https://css.brilliantearth.com/static/img/diamond_shape_new/heart_new.jpg', 7, 1),
    ('Heart', 'F', 'VS1', 1.05, 'Ideal', 'https://css.brilliantearth.com/static/img/diamond_shape_new/heart_new.jpg', 9, 1);



	-- Insert dummy data into PRODUCT table
INSERT INTO PRODUCT (productCode, [Name], Price, [Description], MainDiamondID, LaborCost, ImageLinkList, MainDiamondAmount, SubDiamondAmount, ShellAmount, Status,  CategoryID)
VALUES
('PROD001', 'Cocktail Ring', 3190.00, 'Seven rows of shimmering lab diamonds that wrap the finger in light in this glamorous cocktail design.', 1 ,71.50, 'https://image.brilliantearth.com/media/product_new_images/B7/BE2D7890_yellow_top.jpg;https://image.brilliantearth.com/media/product_new_images/E4/BE2D7890_yellow_side1.jpg;https://image.brilliantearth.com/media/product_images/D2/BE2D1791_yellow_additional1.jpg;https://image.brilliantearth.com/media/product_images/C9/BE2D1791.jpg', 0, 73, 10.50, 1, 1),
('PROD002', 'Ballad Eternity Ring', 1190.00, 'A stunning ring featuring diamonds that encircle the band for a timeless and elegant look.', 5 ,276.00,  'https://image.brilliantearth.com/media/diamond_ring_vto/0M/BE1D54_white_Round_top_2_carat.png;https://image.brilliantearth.com/media/carat_image/84/BE1D54_RD_200ct_white_side1.jpg;https://image.brilliantearth.com/media/product_images/9R/BE1D54-18KW_BE3D20-18KW_3.jpg;https://image.brilliantearth.com/media/product_images/D6/BE1D54_white_additional2.jpeg', 1, 30, 5.00, 1, 9),
('PROD003', 'Riviera Eternity Ring', 1990.00, 'This ring showcases lab diamonds in a continuous band, creating an eternity effect.', 6 ,64.00, 'https://image.brilliantearth.com/media/diamond_ring_vto/3C/BE1M30D_white_Round_top_2_carat.png;https://image.brilliantearth.com/media/carat_image/ED/BE1M30D_RD_200ct_white_side1.jpg;https://image.brilliantearth.com/media/product_images/SF/BE1M30D-18KW-RD_2.jpg;https://image.brilliantearth.com/media/product_images/U1/BE1M30D_white_additional1.jpeg', 1, 50, 7.50, 1, 9),
('PROD004', 'Ellora Ring', 2750.00, 'Featuring lab diamonds around the entire band, this ring sparkles with sophistication.',12 ,82.10,  'https://image.brilliantearth.com/media/diamond_ring_vto/P9/BE1D14842_yellow_Pear_top_2_carat.png;https://image.brilliantearth.com/media/carat_image/B1/BE1D14842_PS_200ct_yellow_side2.jpg;https://image.brilliantearth.com/media/carat_image/BE/BE1D14842_PS_200ct_yellow_side1.jpg;https://image.brilliantearth.com/media/product_images/3V/BE1D14842LC-yellow_035.jpg', 1, 60, 10.00, 1, 1),
('PROD005', 'Lab Grown Stud Earrings', 1995.00, 'Elegant stud earrings featuring certified lab grown diamonds.', 4 ,69.80, 'https://image.brilliantearth.com/media/product_images/DF/BE304RD100_white_top.jpg;https://image.brilliantearth.com/media/product_images/ZJ/BE304RD100LAB_add_img1_96114.jpeg;https://image.brilliantearth.com/media/product_images/04/BE304RD100-18KW_2.jpg;https://image.brilliantearth.com/media/product_images/VK/BE215-18KW_062.jpg', 2, 0, 1.00, 1, 2),
('PROD006', 'Heart Stud Earrings', 425.00, 'Beautiful heart-shaped stud earrings with lab grown diamonds.',13,53.00, 'https://image.brilliantearth.com/media/product_images/7J/BE3D20-18KY_850_top.jpg;https://image.brilliantearth.com/media/product_images/QO/BE3D20-18KY_additional1.jpeg;https://image.brilliantearth.com/media/product_images/WD/expires_oct2024_102422_SL_HP_MinimalistGifts_HERO.jpg;https://image.brilliantearth.com/media/product_images/HV/BE3D20-18KY_2.jpg', 0, 1, 0.25, 1, 6),
('PROD007', 'Luxe Ring', 2590.00, 'Luxe design with diamonds set along the band.', 18,81.00,  'https://image.brilliantearth.com/media/diamond_ring_vto/SA/BE113_white_Round_top_2_carat.png;https://image.brilliantearth.com/media/carat_image/DB/BE113_RD_200ct_white_side1.jpg;https://image.brilliantearth.com/media/product_images/X8/BE113-18KW-N-S6_019.jpg;https://image.brilliantearth.com/media/product_images/A2/BE113_white_additional1.jpg', 1, 0, 9.00, 1,  1),
('PROD008', 'Secret Garden Eternity Ring', 4790.00, 'Nature-inspired with diamonds resembling leaves and vines.', 17,61.60, 'https://image.brilliantearth.com/media/product_images/05/BE2D062_yellow_00.jpg;https://image.brilliantearth.com/media/product_images/L2/BE2D062_yellow_02.jpg;https://image.brilliantearth.com/media/product_images/1V/BE2D062-18KY_2.jpg;https://image.brilliantearth.com/media/product_images/VJ/BE1D225-18KY_3.jpg', 0, 80, 15.00, 1,  9),
('PROD009', 'Twisted Vine Ring', 2490.00, 'Twisted design with diamonds entwined in vines.',8, 72.00, 'https://image.brilliantearth.com/media/product_new_images/ED/BE2D2110_white_top.jpg;https://image.brilliantearth.com/media/product_new_images/32/BE2D2110_white_side1.jpg;https://image.brilliantearth.com/media/product_images/RZ/BE2D2110-18KW_2.jpg;https://image.brilliantearth.com/media/product_images/PO/BE2D2110_white_additional1.jpeg', 0, 50, 8.00, 1, 1),
('PROD010', 'Petite Heart Ring', 1690.00, 'Elegant twist design with petite diamonds.',3, 43.15, 'https://image.brilliantearth.com/media/product_new_images/BA/BE2D621_white_top.jpg;https://image.brilliantearth.com/media/product_new_images/08/BE2D621_white_side1.jpg;https://image.brilliantearth.com/media/product_images/QM/BE2D621-18KW_4.jpg;https://image.brilliantearth.com/media/product_images/5M/BE2D621-18KW_2.jpg', 0, 35, 12.00, 1, 5),
('PROD011', 'Whisper Eternity Necklace', 2890.00, 'Delicate design with diamonds encircling the band.', 19, 68.30,  'https://image.brilliantearth.com/media/product_images/CB/BE4DTN50_white_top.jpg;https://image.brilliantearth.com/media/product_images/7S/BE4DTN50_top.jpeg;https://image.brilliantearth.com/media/product_images/AM/BE1D4257LC-18KW-N-S6_BE4DTN50-18KW_BE4DTN50LC-14KW_062.jpg;https://image.brilliantearth.com/media/product_images/U0/BE3AD603-S_BE4DTN50-18KW_BE4DTN50LC-14KW_070.jpg', 0, 28, 10.00, 1, 4),
('PROD012', 'Certified Stud Earrings', 1995.00, 'Elegant stud earrings featuring certified lab grown diamonds.',  23,79.32, 'https://image.brilliantearth.com/media/product_images/90/BE3DME01318_white_top.jpg;https://image.brilliantearth.com/media/product_images/9X/BE3DME01318_additional1.jpeg;https://image.brilliantearth.com/media/product_images/ZP/BE3DME01318-18KY_top.jpg;https://image.brilliantearth.com/media/product_images/Z5/BE3DME01318-yellow.jpg', 2, 0, 5.50, 1, 2),
('PROD013', 'Diamond Stud Earrings', 495.00, 'Simple and elegant lab grown diamond stud earrings.',  25 ,42.00,  'https://image.brilliantearth.com/media/product_images/D4/BE3D0492E_yellow_top.jpg;https://image.brilliantearth.com/media/product_images/A5/BE3D0492E_white_top.jpg;https://image.brilliantearth.com/media/product_images/0F/BE3D0492E_rose_top.jpg;https://image.brilliantearth.com/media/product_images/FJ/BE3D492E-14KR_060.jpg', 2, 0, 3.50, 1, 2),
('PROD014', 'Heart Lab Earrings', 425.00, 'Beautiful heart-shaped stud earrings with lab grown diamonds.',20,48.00, 'https://image.brilliantearth.com/media/product_images/07/BE3D813_white_top.jpg;https://image.brilliantearth.com/media/product_images/L1/BE3D813-18KW_additional1.jpeg;https://image.brilliantearth.com/media/product_images/74/BE3D813_yellow_top.jpg;https://image.brilliantearth.com/media/product_images/OC/BE3D813-14KY_024.jpg',2, 0, 1.25, 1, 6),
('PROD015', 'Stud Earrings', 3495.00, 'Elegant stud earrings featuring certified lab grown diamonds.',11,70.00, 'https://image.brilliantearth.com/media/product_images/XJ/BE304RD50_top_white.webp;https://image.brilliantearth.com/media/product_images/ZL/BE304RD50_top_yellow.webp;https://image.brilliantearth.com/media/product_images/QE/BE304RD50_top_rose.webp;https://image.brilliantearth.com/media/product_images/KE/BE2FPD14-18KW_v2_3.jpg', 2, 0, 2.00, 1, 2),
('PROD016', 'Lab Diamond Heart Ring', 750.00, 'Elegant lab grown diamond stud ring.', 14, 56.00,'https://image.brilliantearth.com/media/product_images/SU/BE2D15103_yellow_top_5.webp;https://image.brilliantearth.com/media/product_images/FL/BE2D15103_yellow_side1.webp;https://image.brilliantearth.com/media/product_images/EY/BE2D15103-18KY-N-S6_034.jpg;https://image.brilliantearth.com/media/product_images/D7/BE2119_yellow_additional1.jpg', 2, 0, 3.75, 1,  5),
('PROD017', 'Lab Grown Stud Earrings', 1295.00, 'Classic and elegant lab grown diamond stud earrings.', 60 ,75.00,  'https://image.brilliantearth.com/media/product_images/24/BE3H22_white_top.jpg;https://image.brilliantearth.com/media/product_images/AD/BE3H22_yellow_top.jpg;https://image.brilliantearth.com/media/product_images/DS/BE3H22-14KY_034.jpg;https://image.brilliantearth.com/media/product_images/A6/BE3H22-S_2.jpg', 2, 0, 1.90, 1, 2),
('PROD018', 'Heart Lab Diamond Earrings', 425.00, 'Beautiful heart-shaped stud earrings with lab grown diamonds.', 61, 59.00,'https://image.brilliantearth.com/media/product_images/17/BE3DVE1225A_yellow_top.jpg;https://image.brilliantearth.com/media/product_images/FB/BE3DVE1225A-14KY_additional1.webp;https://image.brilliantearth.com/media/product_images/3E/BE3DVE1225A_white_top.jpg;https://image.brilliantearth.com/media/product_images/EK/BE3DVE1225A-14KW_additional1.jpeg', 0, 2, 0.25, 1,  6),
('PROD019', 'Certified Lab Stud Earrings', 1995.00, 'Elegant stud earrings featuring certified lab grown diamonds.', 58, 81.30, 'https://image.brilliantearth.com/media/product_images/9A/BE3D4212_white_top.jpg;https://image.brilliantearth.com/media/product_images/21/BE3D4212_yellow_top.jpg;https://image.brilliantearth.com/media/product_images/DF/BE3D4212_rose_top.jpg;https://image.brilliantearth.com/media/product_images/VP/BE304RD50-14KR_BE3D4212-14KR_007.jpg', 2, 0, 7.50, 1,  2),
('PROD020', 'Baguette Bracelet', 3990.00, 'A sophisticated bracelet featuring baguette and round diamonds in 18K yellow gold.', 41,74.20, 'https://image.brilliantearth.com/media/product_images/FQ/BE5dibm65-18KY_top.jpg;https://image.brilliantearth.com/media/product_images/3O/BE5dibm65-14KY_detail.jpg;https://image.brilliantearth.com/media/product_images/0Q/BE5dibm65-14KW_top_850.jpg;https://image.brilliantearth.com/media/product_images/EH/BE5dibm65-14KW_detail.jpg', 0, 20, 12.00, 1, 3),
('PROD021', 'Paperclip Lab Bracelet', 1295.00, 'A modern paperclip design adorned with lab-grown diamonds in 14K yellow gold.', 42, 68.00,  'https://image.brilliantearth.com/media/product_images/22/BE5D10TB65_white_top.jpg;https://image.brilliantearth.com/media/product_images/27/BE5D10TB65-18KY_additional1.jpg;https://image.brilliantearth.com/media/product_images/OF/BE5D10TB65-18KR_additional1.jpg;https://image.brilliantearth.com/media/product_images/1K/BE5D10TB-18KW_1_1.jpeg', 0, 15, 7.00, 1, 3),
('PROD022', 'Aster Bracelet', 1795.00, 'Elegant lab diamond tennis bracelet with a classic design.', 48, 73.50,  'https://image.brilliantearth.com/media/product_images/38/BE5D0714BN_yellow_top.jpg;https://image.brilliantearth.com/media/product_images/GN/BE5DIBV65_BE5D714B7-18KY_BE5D714B7-18KW_BE5DIBM65_BE5D1263BNLC_BE5D714B7_BE5DIBV65.jpg;https://image.brilliantearth.com/media/product_images/9F/BE5D0714BN_rose_top.jpg;https://image.brilliantearth.com/media/product_images/FH/BE5D714BN-14KR_2.jpg', 1, 27, 6.00, 1, 3),
('PROD023', 'Beatrice Bracelet', 1795.00, 'A stunning tennis bracelet featuring lab-grown diamonds.',28, 80.00, 'https://image.brilliantearth.com/media/product_images/ZB/BE5D302-S_white_top.jpg;https://image.brilliantearth.com/media/product_images/A1/BE5D302-14KY_yellow_top.jpg;https://image.brilliantearth.com/media/product_images/08/BE5D300-14KY_BE1D999-18KY_016.jpg;https://image.brilliantearth.com/media/product_images/S9/BE5D300-S_2_1.jpg', 0, 25, 6.00, 1,  3),
('PROD024', 'Emerald Diamond Bracelet', 14990.00, 'An exquisite bracelet with emerald-cut diamonds in 18K white gold.',32, 84.00,'https://image.brilliantearth.com/media/product_images/19/BE5D501_yellow_top.jpg;https://image.brilliantearth.com/media/product_images/B0/BE5D501_white_top.jpg;https://image.brilliantearth.com/media/product_images/D0/BE5D501.jpeg;https://image.brilliantearth.com/media/product_images/6B/BE22002-18KW-S7_029.jpg', 1, 21, 20.00, 1, 3),
('PROD025', 'Oval Diamond Bracelet', 13990.00, 'A luxurious oval diamond tennis bracelet set in 14K white gold.',26, 78.60, 'https://image.brilliantearth.com/media/product_images/CE/BE5dibv65-18KW_top.jpg;https://image.brilliantearth.com/media/product_images/WJ/BE5dibv65-18KW_detail.jpg;https://image.brilliantearth.com/media/product_images/NB/BE5dibv65-18KW_additional1.jpg;https://image.brilliantearth.com/media/product_images/OL/BE5DIBV65_BE2SBT100_BE5D714B7_BE1D5320_BE2D064.jpg', 12, 0, 18.00, 1, 3),
('PROD026', 'Heart Diamond Bracelet', 6000.00, 'A romantic bracelet featuring heart-shaped lab diamonds in 18K white gold.',37,67.00, 'https://image.brilliantearth.com/media/product_images/ED/BE5D010TBLAB_white_top.jpg;https://image.brilliantearth.com/media/product_images/2S/BE5D010TB_white_additional1.jpg;https://image.brilliantearth.com/media/product_images/0P/BE5D010TB-PT_additional3.webp;https://image.brilliantearth.com/media/product_images/G4/BE5D10TB-18KW_1.webp', 10, 0, 42.00, 1,7),
('PROD027', 'Heart Ring', 23000.00, 'A magnificent ring with princess-cut diamonds in 14K white gold.', 39,72.00, 'https://image.brilliantearth.com/media/product_new_images/B7/BE2D7890_yellow_top.jpg;https://image.brilliantearth.com/media/product_new_images/E4/BE2D7890_yellow_side1.jpg;https://image.brilliantearth.com/media/product_images/D2/BE2D1791_yellow_additional1.jpg;https://image.brilliantearth.com/media/product_images/C9/BE2D1791.jpg', 21, 0, 45.00, 1, 5),
('PROD028', 'Marquise Tennis Bracelet', 6795.00, 'An elegant bracelet featuring marquise-cut lab diamonds in 18K white gold.', 40,68.00, 'https://image.brilliantearth.com/media/product_images/GV/BE5D251_white_side.jpg;https://image.brilliantearth.com/media/product_images/YE/BE5D251_white_top.jpg;https://image.brilliantearth.com/media/product_images/HG/BE5D251-S_001.jpg;https://image.brilliantearth.com/media/product_images/IC/BE2D2006-18KW_055.jpeg', 1, 20, 23.00, 1,3),
('PROD029', 'Olivetta Tennis Bracelet', 5000.00, 'A timeless tennis bracelet adorned with lab-grown diamonds.',57, 69.00, 'https://image.brilliantearth.com/media/product_images/FQ/BE5dibm65-18KY_top.jpg;https://image.brilliantearth.com/media/product_images/3O/BE5dibm65-14KY_detail.jpg;https://image.brilliantearth.com/media/product_images/0Q/BE5dibm65-14KW_top_850.jpg;https://image.brilliantearth.com/media/product_images/EH/BE5dibm65-14KW_detail.jpg', 0, 30, 62.00, 1, 3),
('PROD030', 'Willow Diamond Necklace', 2650.00, 'A delicate necklace featuring a diamond-encrusted willow branch design.',53, 76.00,'https://image.brilliantearth.com/media/product_images/CB/BE4DTN50_white_top.jpg;https://image.brilliantearth.com/media/product_images/7S/BE4DTN50_top.jpeg;https://image.brilliantearth.com/media/product_images/AM/BE1D4257LC-18KW-N-S6_BE4DTN50-18KW_BE4DTN50LC-14KW_062.jpg;https://image.brilliantearth.com/media/product_images/U0/BE3AD603-S_BE4DTN50-18KW_BE4DTN50LC-14KW_070.jpg', 0, 54, 51.50, 1, 4),
('PROD031', 'Luna Diamond Ring', 4800.00, 'A stunning ring with a crescent moon design adorned with diamonds.',62,81.00,'https://image.brilliantearth.com/media/diamond_ring_vto/SA/BE113_white_Round_top_2_carat.png;https://image.brilliantearth.com/media/carat_image/DB/BE113_RD_200ct_white_side1.jpg;https://image.brilliantearth.com/media/product_images/X8/BE113-18KW-N-S6_019.jpg;https://image.brilliantearth.com/media/product_images/A2/BE113_white_additional1.jpg', 1, 15, 6.20, 1,  1),
('PROD032', 'Starburst Necklace', 3400.00, 'A radiant starburst design necklace featuring brilliant diamonds.',38, 63.00, 'https://image.brilliantearth.com/media/product_images/AE/BE4D706C_white_top.jpg;https://image.brilliantearth.com/media/product_images/5B/BE4D363_additional1.jpg;https://image.brilliantearth.com/media/product_images/LT/BE4D706C-S.jpg;https://image.brilliantearth.com/media/product_images/6J/BE4D706C-S_v2.jpg', 3, 0, 45.00, 1,4),
('PROD033', 'Infinity Diamond Necklace', 1790.00, 'An elegant infinity symbol necklace with lab-grown diamonds.',45,77.00,'https://image.brilliantearth.com/media/product_images/VW/BE4SPCC16_yellow_top.jpeg;https://image.brilliantearth.com/media/product_images/EU/expires_oct2024_102422_SL_HP_TrendsettingGifts_HERO.jpg;https://image.brilliantearth.com/media/product_images/S5/BE4LPCC16-14KY_BE4D535-14KY_047.jpg;https://image.brilliantearth.com/media/product_images/MG/BE4LPCC16-14KY_BE4PL14-14KW_025.jpg', 0, 42, 3.00, 1, 4),
('PROD034', 'Hearts Diamond Necklace', 6200.00, 'A beautiful necklace featuring hearts and arrows design set with diamonds.',4, 58.90, 'https://image.brilliantearth.com/media/shape_images/Z3/BE401_round_white_top.jpg;https://image.brilliantearth.com/media/product_images/K8/BE401_SIDE_WG_1.jpeg;https://image.brilliantearth.com/media/product_images/NB/BE401_3_4_WG_1.jpeg;https://image.brilliantearth.com/media/shape_images/AI/BE401_RD1_white.png', 1, 0, 25.00, 1,8),
('PROD035', 'Blossom Diamond Ring', 395.00, 'A charming pendant with a floral blossom design encrusted with diamonds.',7, 43.00,  'https://image.brilliantearth.com/media/product_new_images/B2/BE2M3420H_white_top.jpg;https://image.brilliantearth.com/media/product_new_images/D3/BE2M3420H_white_side1.jpg;https://image.brilliantearth.com/media/product_images/I7/BE2M3420H-18KW_2.jpg;https://image.brilliantearth.com/media/product_images/46/BE2M3420H_white_additional1.jpeg', 0, 5, 4.00, 1, 5),
('PROD036', 'Cocktail Ring', 3190.00, 'Seven rows of shimmering lab diamonds that wrap the finger in light in this glamorous cocktail design.',9, 71.50,  'https://image.brilliantearth.com/media/product_new_images/B7/BE2D7890_yellow_top.jpg;https://image.brilliantearth.com/media/product_new_images/E4/BE2D7890_yellow_side1.jpg;https://image.brilliantearth.com/media/product_images/D2/BE2D1791_yellow_additional1.jpg;https://image.brilliantearth.com/media/product_images/C9/BE2D1791.jpg', 0, 73, 10.50, 1, 1),
('PROD037', 'Ballad Eternity Ring', 1190.00, 'A stunning ring featuring diamonds that encircle the band for a timeless and elegant look.',19 ,76.00, 'https://image.brilliantearth.com/media/diamond_ring_vto/0M/BE1D54_white_Round_top_2_carat.png;https://image.brilliantearth.com/media/carat_image/84/BE1D54_RD_200ct_white_side1.jpg;https://image.brilliantearth.com/media/product_images/9R/BE1D54-18KW_BE3D20-18KW_3.jpg;https://image.brilliantearth.com/media/product_images/D6/BE1D54_white_additional2.jpeg', 1, 30, 5.00, 1,  9),
('PROD038', 'Riviera Eternity Ring', 1990.00, 'This ring showcases lab diamonds in a continuous band, creating an eternity effect.', 20,64.00, 'https://image.brilliantearth.com/media/diamond_ring_vto/3C/BE1M30D_white_Round_top_2_carat.png;https://image.brilliantearth.com/media/carat_image/ED/BE1M30D_RD_200ct_white_side1.jpg;https://image.brilliantearth.com/media/product_images/SF/BE1M30D-18KW-RD_2.jpg;https://image.brilliantearth.com/media/product_images/U1/BE1M30D_white_additional1.jpeg', 1, 50, 7.50, 1, 9),
('PROD039', 'Ellora Ring', 2750.00, 'Featuring lab diamonds around the entire band, this ring sparkles with sophistication.', 15,82.10,'https://image.brilliantearth.com/media/diamond_ring_vto/P9/BE1D14842_yellow_Pear_top_2_carat.png;https://image.brilliantearth.com/media/carat_image/B1/BE1D14842_PS_200ct_yellow_side2.jpg;https://image.brilliantearth.com/media/carat_image/BE/BE1D14842_PS_200ct_yellow_side1.jpg;https://image.brilliantearth.com/media/product_images/3V/BE1D14842LC-yellow_035.jpg', 1, 60, 10.00, 1, 1),
('PROD040', 'Lab Grown Stud Earrings', 1995.00, 'Elegant stud earrings featuring certified lab grown diamonds.',20, 69.80, 'https://image.brilliantearth.com/media/product_images/DF/BE304RD100_white_top.jpg;https://image.brilliantearth.com/media/product_images/ZJ/BE304RD100LAB_add_img1_96114.jpeg;https://image.brilliantearth.com/media/product_images/04/BE304RD100-18KW_2.jpg;https://image.brilliantearth.com/media/product_images/VK/BE215-18KW_062.jpg', 2, 0, 1.00, 1, 2),
('PROD041', 'Heart Stud Earrings', 425.00, 'Beautiful heart-shaped stud earrings with lab grown diamonds.',55,53.00,'https://image.brilliantearth.com/media/product_images/7J/BE3D20-18KY_850_top.jpg;https://image.brilliantearth.com/media/product_images/QO/BE3D20-18KY_additional1.jpeg;https://image.brilliantearth.com/media/product_images/WD/expires_oct2024_102422_SL_HP_MinimalistGifts_HERO.jpg;https://image.brilliantearth.com/media/product_images/HV/BE3D20-18KY_2.jpg', 0, 1, 0.25, 1, 6),
('PROD042', 'Luxe Ring', 2590.00, 'Luxe design with diamonds set along the band.',60,81.00, 'https://image.brilliantearth.com/media/diamond_ring_vto/SA/BE113_white_Round_top_2_carat.png;https://image.brilliantearth.com/media/carat_image/DB/BE113_RD_200ct_white_side1.jpg;https://image.brilliantearth.com/media/product_images/X8/BE113-18KW-N-S6_019.jpg;https://image.brilliantearth.com/media/product_images/A2/BE113_white_additional1.jpg', 1, 0, 9.00, 1, 1),
('PROD043', 'Secret Garden Eternity Ring', 4790.00, 'Nature-inspired with diamonds resembling leaves and vines.',27,61.60,'https://image.brilliantearth.com/media/product_images/05/BE2D062_yellow_00.jpg;https://image.brilliantearth.com/media/product_images/L2/BE2D062_yellow_02.jpg;https://image.brilliantearth.com/media/product_images/1V/BE2D062-18KY_2.jpg;https://image.brilliantearth.com/media/product_images/VJ/BE1D225-18KY_3.jpg', 0, 80, 15.00, 1,9),
('PROD044', 'Twisted Vine Ring', 2490.00, 'Twisted design with diamonds entwined in vines.',42, 72.00,  'https://image.brilliantearth.com/media/product_new_images/ED/BE2D2110_white_top.jpg;https://image.brilliantearth.com/media/product_new_images/32/BE2D2110_white_side1.jpg;https://image.brilliantearth.com/media/product_images/RZ/BE2D2110-18KW_2.jpg;https://image.brilliantearth.com/media/product_images/PO/BE2D2110_white_additional1.jpeg', 0, 50, 8.00, 1, 1),
('PROD045', 'Petite Heart Ring', 1690.00, 'Elegant twist design with petite diamonds.',53, 43.15, 'https://image.brilliantearth.com/media/product_new_images/BA/BE2D621_white_top.jpg;https://image.brilliantearth.com/media/product_new_images/08/BE2D621_white_side1.jpg;https://image.brilliantearth.com/media/product_images/QM/BE2D621-18KW_4.jpg;https://image.brilliantearth.com/media/product_images/5M/BE2D621-18KW_2.jpg', 0, 35, 12.00, 1, 5),
('PROD046', 'Whisper Eternity Necklace', 2890.00, 'Delicate design with diamonds encircling the band.',30, 68.30,  'https://image.brilliantearth.com/media/product_images/CB/BE4DTN50_white_top.jpg;https://image.brilliantearth.com/media/product_images/7S/BE4DTN50_top.jpeg;https://image.brilliantearth.com/media/product_images/AM/BE1D4257LC-18KW-N-S6_BE4DTN50-18KW_BE4DTN50LC-14KW_062.jpg;https://image.brilliantearth.com/media/product_images/U0/BE3AD603-S_BE4DTN50-18KW_BE4DTN50LC-14KW_070.jpg', 0, 28, 10.00, 1, 4),
('PROD047', 'Certified Stud Earrings', 1995.00, 'Elegant stud earrings featuring certified lab grown diamonds.',31, 79.32, 'https://image.brilliantearth.com/media/product_images/90/BE3DME01318_white_top.jpg;https://image.brilliantearth.com/media/product_images/9X/BE3DME01318_additional1.jpeg;https://image.brilliantearth.com/media/product_images/ZP/BE3DME01318-18KY_top.jpg;https://image.brilliantearth.com/media/product_images/Z5/BE3DME01318-yellow.jpg', 2, 0, 5.50, 1, 2),
('PROD048', 'Diamond Stud Earrings', 495.00, 'Simple and elegant lab grown diamond stud earrings.',33, 42.00, 'https://image.brilliantearth.com/media/product_images/D4/BE3D0492E_yellow_top.jpg;https://image.brilliantearth.com/media/product_images/A5/BE3D0492E_white_top.jpg;https://image.brilliantearth.com/media/product_images/0F/BE3D0492E_rose_top.jpg;https://image.brilliantearth.com/media/product_images/FJ/BE3D492E-14KR_060.jpg', 2, 0, 3.50, 1, 2);

	-- Insert dummy data into ORDERDETAIL table
	INSERT INTO ORDERDETAIL (OrderID, LineTotal, ProductID, ShellMaterialID, SubDiamondID, Size, Status) VALUES
	(1, 2000.00, 1, 2, 3, 7.5, 1),
	(2, 5000.00, 2, 2, 3, 18.0, 1),
	(3, 3000.00, 3, 3, 4, 16.0, 1),
	(4, 1500.00, 4, 4, 5, 6.0, 1),
	(5, 3500.00, 5, 3, 6, 20.0, 1), -- Changed ShellMaterialID to 3
	(6, 10000.00, 1, 3, 7, 22.0, 1), -- Changed ProductID to 1 and ShellMaterialID to 3
	(7, 4000.00, 2, 1, 1, 12.0, 1); -- Changed ProductID to 2 and ShellMaterialID to 1

	-- Insert dummy data into WARRANTY table
	INSERT INTO WARRANTY (OrderDetailID, StartDate, EndDate, Status) VALUES
	(1, GETDATE(), DATEADD(year, 1, GETDATE()), 1),
	(2, GETDATE(), DATEADD(year, 1, GETDATE()), 1),
	(3, GETDATE(), DATEADD(year, 1, GETDATE()), 1),
	(4, GETDATE(), DATEADD(year, 1, GETDATE()), 1),
	(5, GETDATE(), DATEADD(year, 1, GETDATE()), 1),
	(6, GETDATE(), DATEADD(year, 1, GETDATE()), 1),
	(7, GETDATE(), DATEADD(year, 1, GETDATE()), 1);

	-- Insert dummy data into SIZE table
	INSERT INTO SIZE (CategoryID, MinSize, MaxSize, Step) VALUES
	(1, 5.0, 12.0, 0.5),
	(2, 8.0, 16.0, 2.0),
	(3, 50.0, 56.0, 1.0),
	(4, 400.0, 700.0, 100.0),
	(5, 5.0, 12.0, 0.5),
	(6, 8.0, 16.0, 2.0),
	(7, 50.0, 56.0, 1.0),
	(8, 400.0, 700.0, 100.0),
	(9,  5.0, 12.0, 0.5);
	-- Insert more dummy data into PURCHASEORDER table with different dates
INSERT INTO PURCHASEORDER (UserID, [Date], PaymentMethod, Name, PhoneNumber, ShippingAddress, TotalPrice, [OrderStatus], PromotionID, PayWithPoint, Note, SaleStaff, DeliveryStaff) VALUES
(1, '2023-01-15', 'Credit Card', 'John Doe', '123-456-7890', '123 Main St', 220.00, 'Pending', 1, 0, 'Expedited shipping', 1, 2),
(2, '2023-02-20', 'PayPal', 'Jane Smith', '234-567-8901', '456 Elm St', 305.00, 'Shipped', 2, 1, 'Deliver ASAP', 3, 4),
(3, '2023-02-28', 'Credit Card', 'Alice Johnson', '345-678-9012', '789 Oak St', 175.00, 'Delivered', 1, 0, 'Extra packaging needed', 2, 3),
(4, '2023-03-05', 'PayPal', 'Bob Brown', '456-789-0123', '101 Pine St', 290.00, 'Completed', 3, 1, 'Handle with care', 1, 5),
(5, '2023-04-10', 'Credit Card', 'Carol White', '567-890-1234', '202 Cedar St', 380.00, 'Pending', 4, 0, 'Leave at doorstep', 3, 6),
(6, '2023-05-15', 'PayPal', 'David Black', '678-901-2345', '303 Birch St', 420.00, 'Cancelled', 5, 1, 'Hold for pickup', 2, 3),
(7, '2023-06-25', 'Credit Card', 'Eve Green', '789-012-3456', '404 Maple St', 440.00, 'Pending', 6, 0, 'Signature required', 4, 7);
