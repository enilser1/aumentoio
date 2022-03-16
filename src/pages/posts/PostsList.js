import React, { useEffect, useState } from 'react';
import Title from '../../components/Title/Title';
import Post from '../../components/Post';
import { GeneralError } from '../../pages/error';
import './PostsList.scss'
import { getPosts } from '../../services/posts';


const PostsList = () => {
    const [APIData, setAPIData] = useState([]);
    const [hasError, setHasError] = useState(false);

    useEffect(() => {
      getPosts()
        .then(({ posts }) => {
          setAPIData(posts);
          setHasError(false);
        })
        .catch(() => {
          setHasError(true);
          setAPIData([]);
        })
    }, [])

    return <>
      { hasError && <GeneralError />}
      { !hasError &&
        <>
          <Title>Recent Posts</Title>
          <main className='post-list'>
            { APIData.map(post => ( <Post url="#recentposts" key={post.id} {...post}/> )) }
          </main>
        </>
      }
    </>;
};

export default PostsList;