<?php
defined('BASEPATH') OR exit('No direct script access allowed');

/*
| -------------------------------------------------------------------------
| URI ROUTING
| -------------------------------------------------------------------------
| This file lets you re-map URI requests to specific controller functions.
|
| Typically there is a one-to-one relationship between a URL string
| and its corresponding controller class/method. The segments in a
| URL normally follow this pattern:
|
|	example.com/class/method/id/
|
| In some instances, however, you may want to remap this relationship
| so that a different class/function is called than the one
| corresponding to the URL.
|
| Please see the user guide for complete details:
|
|	https://codeigniter.com/user_guide/general/routing.html
|
| -------------------------------------------------------------------------
| RESERVED ROUTES
| -------------------------------------------------------------------------
|
| There are three reserved routes:
|
|	$route['blog/default_controller'] = 'welcome';
|
| This route indicates which controller class should be loaded if the
| URI contains no data. In the above example, the "welcome" class
| would be loaded.
|
|	$route['blog/404_override'] = 'errors/page_missing';
|
| This route will tell the Router which controller/method to use if those
| provided in the URL cannot be matched to a valid route.
|
|	$route['blog/translate_uri_dashes'] = FALSE;
|
| This is not exactly a route, but allows you to automatically route
| controller and method names that contain dashes. '-' isn't a valid
| class or method name character, so it requires translation.
| When you set this option to TRUE, it will replace ALL dashes in the
| controller and method URI segments.
|
| Examples:	my-controller/index	-> my_controller/index
|		my-controller/my-method	-> my_controller/my_method
*/

# blog root
$route['default_controller'] = 'lms/Homepage';

/*
|--------------------------------------------------------------------------
| user controllers
|--------------------------------------------------------------------------
|
*/

# auth index
$route['auth'] = 'user/auth/index';
$route['auth/process'] = 'user/auth/process_login';

$route['auth/register'] = 'user/auth/register';
$route['auth/facebook'] = 'user/auth/auth_facebook';
$route['auth/google'] = 'user/auth/auth_google';
$route['auth/confirm/(:any)'] = 'user/auth/confirm_email/$1';

$route['auth/process_logout'] = 'user/auth/process_logout';

# payment
$route['payment/order/(:any)'] = 'user/payment/order/$1';
$route['payment/success'] = 'user/payment/success';
$route['payment/waiting'] = 'user/payment/waiting';
$route['payment/waiting-confirmation/(:any)'] = 'user/payment/waiting_confirmation/$1';

$route['payment/use_coupon'] = 'user/payment/use_coupon';
$route['payment/process_free'] = 'user/payment/process_free';

$route['payment/process_manual'] = 'user/payment/process_manual';
$route['payment/confirmation/(:any)'] = 'user/payment/confirmation/$1';

$route['payment/process_midtrans'] = 'user/payment/process_midtrans';
$route['payment/notification_midtrans'] = 'user/payment/notification_midtrans';


# handling default controller user
$route['user/auth(.*)'] = 'My_error'; 
$route['user/payment(.*)'] = 'My_error';

/*
|--------------------------------------------------------------------------
| lms controllers
|--------------------------------------------------------------------------
|
*/

# lms courses
$route['courses-detail/(:any)'] = 'lms/Courses/index/$1';

# lms lesson
$route['courses-lesson/(:any)/(:any)/(:any)'] = 'lms/Lesson/index/$1/$2/$3';

# lesson search
$route['courses-filter'] = 'lms/Filter/index/';

# handling default controller lms
$route['lms/homepage(.*)'] = 'My_error'; 
$route['lms/courses(.*)'] = 'My_error'; 
$route['lms/lesson(.*)'] = 'My_error'; 
$route['lms/search-filter(.*)'] = 'My_error'; 

/*
|--------------------------------------------------------------------------
| blog controllers
|--------------------------------------------------------------------------
|
*/

# blog index
$route['blog'] = 'blog/Homepage/index';

# blog category index
$route['blog-category/(:any)'] = 'blog/Category/index/$1';

# blog tags index
$route['blog-tags/(:any)'] = 'blog/Tags/index/$1';

# blog search index
$route['blog-search'] = 'blog/Search/index/';

# blog post
$route['blog-post/(:any)'] = 'blog/Post/index/$1';

# handling default controller blog
$route['blog/category(.*)'] = 'My_error'; 
$route['blog/homepage(.*)'] = 'My_error'; 
$route['blog/post(.*)'] = 'My_error'; 
$route['blog/search(.*)'] = 'My_error'; 
$route['blog/tags(.*)'] = 'My_error'; 

/*
|--------------------------------------------------------------------------
| site controllers
|--------------------------------------------------------------------------
|
*/

# pages
$route['p/(:any)'] = 'site/Pages/index/$1';

# robots.txt, ads.txt
$route['robots\.txt'] = 'site/Txt/robots_txt';
$route['ads\.txt'] = 'site/Txt/ads_txt';

# feed
$route['feeds/courses'] = 'site/Feeds/courses';
$route['feeds/blog_post'] = 'site/Feeds/blog_post';


# sitemap
$route['sitemap\.xml'] = 'site/Sitemap/sitemap_index';
$route['root\.xml'] = 'site/Sitemap/sitemap_root';
$route['sitemap-courses-(:any)\.xml'] = 'site/Sitemap/sitemap_courses/$1';
$route['sitemap-blog-post-(:any)\.xml'] = 'site/Sitemap/sitemap_blog_post/$1';
$route['sitemap-pages-(:any)\.xml'] = 'site/Sitemap/sitemap_pages/$1';

# handling default controller site
$route['site/feeds(.*)'] = 'My_error'; 
$route['site/pages(.*)'] = 'My_error'; 
$route['site/sitemap(.*)'] = 'My_error'; 
$route['site/txt(.*)'] = 'My_error'; 

/*
|--------------------------------------------------------------------------
| app controllers
|--------------------------------------------------------------------------
|
*/

# admin page
$route['app'] = 'app/Dashboard';


$route['404_override'] = 'My_error';
$route['translate_uri_dashes'] = FALSE;
